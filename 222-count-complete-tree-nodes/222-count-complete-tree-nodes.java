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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int left=leftHeight(root);
        int right=rightHeight(root);
        //System.out.println(left+" "+right);
        if(left==right)return (2<<left)-1;
        else return 1+countNodes(root.left)+countNodes(root.right);
    }
    int leftHeight(TreeNode root){
        int c=0;
        while(root.left!=null){
            c++;
            root=root.left;
        }
        return c;
    }
    int rightHeight(TreeNode root){
        int c=0;
        while(root.right!=null){
            c++;
            root=root.right;
        }
        return c;
    }
}