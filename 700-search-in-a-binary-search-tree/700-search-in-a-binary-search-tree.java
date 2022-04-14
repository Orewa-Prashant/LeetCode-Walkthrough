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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)return null;
        TreeNode left=null,right=null;
        if(root.val==val)return root;
        else if(root.val>val)
            left = searchBST(root.left,val);
        else right = searchBST(root.right,val);
        return (left==null)?right:left;

    }
}