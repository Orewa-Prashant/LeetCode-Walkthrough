/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        
        return fun(arr,0,arr.size()-1);
    }
    void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    TreeNode fun(ArrayList<Integer> nums, int left, int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums.get(mid));
        root.right=fun(nums,mid+1,right);
        root.left=fun(nums,left,mid-1);
        return root;
    }
}