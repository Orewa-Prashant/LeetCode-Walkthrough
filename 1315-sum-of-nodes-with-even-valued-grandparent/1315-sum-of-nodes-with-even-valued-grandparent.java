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
    int ans=0;
    public int sumEvenGrandparent(TreeNode root) {
        fun(root,null,null);
        return ans;
    }
    void fun(TreeNode child,TreeNode parent,TreeNode grandParent){
        if(child==null)return;
        
        if(grandParent!=null&&grandParent.val%2==0){
            ans+=child.val;
        }
        fun(child.left,child,parent);
        fun(child.right,child,parent);
    }
}