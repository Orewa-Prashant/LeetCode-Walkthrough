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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        fun(root,ans,0);
        return ans;
    }
    void fun(TreeNode root, List<Integer> ans,int level){
        if(root==null)return;
        if(level>=ans.size())
        ans.add(root.val);
        fun(root.right,ans,level+1);  // Just traverse the righ subtree first and everything is daijobu ( fine ).
        fun(root.left,ans,level+1);
    }
}