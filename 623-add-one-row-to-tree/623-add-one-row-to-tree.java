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
    TreeNode newHead=null;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        fun(root,val,depth);
        return newHead==null?root:newHead;
    }
    void fun(TreeNode root, int val, int depth){
        if(root==null)return;
        if(depth==1){
            TreeNode nd=new TreeNode(val);
            nd.left=root;
            newHead=nd;
            return;
        }
        if(depth==2){
            TreeNode newNodeLeft=new TreeNode(val);
            TreeNode newNodeRight=new TreeNode(val);
            newNodeLeft.left=root.left;
            newNodeRight.right=root.right;
            root.left=newNodeLeft;
            root.right=newNodeRight;
            return;
        }
        fun(root.left,val,depth-1);
        fun(root.right,val,depth-1);
    }
}