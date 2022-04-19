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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key){
            TreeNode left=root.left,right=root.right;
            if(right==null && left==null)return null;
            if(right==null)return left;
            else if(left==null)return right;
            while(right.left!=null)right=right.left;
            right.left=left;
            return root.right;
        }
        root.left=deleteNode(root.left,key);
        root.right=deleteNode(root.right,key);
        return root; 
    }
}