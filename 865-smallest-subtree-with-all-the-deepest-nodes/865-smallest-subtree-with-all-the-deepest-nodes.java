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
    TreeNode lca=null;
    int deepest=0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        fun(root,0);
        return lca;
    }
    int fun(TreeNode root, int depth){
        deepest=Math.max(deepest,depth);
        
        if(root==null)return depth;      //cTook help from Leetcode's Discuss section
        
        int left=fun(root.left,depth+1);
        int right=fun(root.right,depth+1);
        
        if(left==deepest && right==deepest)
            lca=root;
        
        return Math.max(left,right);
    }
}