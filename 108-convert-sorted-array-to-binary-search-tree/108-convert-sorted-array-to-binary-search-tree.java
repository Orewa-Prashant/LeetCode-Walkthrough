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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length-1;
        int mid=n/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.right=fun(nums,mid+1,n);
        root.left=fun(nums,0,mid-1);
        return root;
    }
    TreeNode fun(int[] nums, int left, int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.right=fun(nums,mid+1,right);
        root.left=fun(nums,left,mid-1);
        return root;
    }
}