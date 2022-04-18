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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode newNode=new TreeNode(val);
            return newNode;
        }
        fun(root,val,null,false);
        return root;
    }
    void fun(TreeNode root, int val,TreeNode parent,boolean dir){
        if(root==null){
            TreeNode newNode=new TreeNode(val);
            if(dir)parent.right=newNode;
            else parent.left=newNode;
            return;
        }
        
        if(root.val<val)fun(root.right,val,root,true);
        if(root.val>val)fun(root.left,val,root,false); 
    }
}