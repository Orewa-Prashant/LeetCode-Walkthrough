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
    public int kthSmallest(TreeNode root, int k) {
        int[] ans=new int[]{-1,k};
        fun(root,ans);
        return ans[0];
    }
    void fun(TreeNode root, int[] ans){
        if(root==null)return;
        
        fun(root.left,ans);
        ans[1]--;
        if(ans[1]==0)ans[0]=root.val;
        fun(root.right,ans);
    }
}