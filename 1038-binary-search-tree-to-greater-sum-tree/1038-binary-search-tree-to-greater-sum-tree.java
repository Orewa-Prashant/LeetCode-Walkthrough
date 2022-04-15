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
    public TreeNode bstToGst(TreeNode root) {
        int[] add=new int[]{0};
        fun(root,add);
        return root;
    }
    int fun(TreeNode root, int[] add){
        if(root==null)return 0;
        int right=fun(root.right,add);
        root.val+=add[0];
        add[0]=root.val;
        int left=fun(root.left,add);
        
        return root.val;
    }
}