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
    public String tree2str(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,null,sb);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    void preorder(TreeNode root, TreeNode par, StringBuilder sb){
        if(root==null){
            return;
        }
        if(par!=null && par.left==null){
            sb.append("()");
        }
        sb.append('(');
        sb.append(root.val+"");
        //System.out.println(sb+"---> "+root.val);
        preorder(root.left,root,sb);
        preorder(root.right,root,sb);
        sb.append(')');
    }
}