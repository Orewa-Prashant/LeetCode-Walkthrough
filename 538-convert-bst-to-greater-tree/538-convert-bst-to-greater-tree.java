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
    public TreeNode convertBST(TreeNode root) {
        int[] add=new int[]{0};
        fun(root,add);
        return root;
    }
    void fun(TreeNode root, int[] add){
        if(root==null)return;
        fun(root.right,add);
        root.val+=add[0];
        add[0]=root.val;
        fun(root.left,add);
    }
}