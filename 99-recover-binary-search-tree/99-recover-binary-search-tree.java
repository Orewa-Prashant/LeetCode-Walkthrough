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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        assignTree(root,ans,new int[]{0});
    }
    void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null)return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    void assignTree(TreeNode root, ArrayList<Integer> ans, int[] ind){
        if(root==null)return;
        assignTree(root.left,ans,ind);
        root.val=ans.get(ind[0]++);
        assignTree(root.right,ans,ind);
    }
}