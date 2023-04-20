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
    public int widthOfBinaryTree(TreeNode root) {
        return fun(root,0,new ArrayList<Integer>(),0)+1;
    }
    int fun(TreeNode root,int index, ArrayList<Integer> al, int level){
        if(root==null)return 0;
        if(al.size()<=level)al.add(index);

        int left=fun(root.left,2*index,al,level+1);
        int right=fun(root.right,2*index+1,al,level+1);
        return Math.max(Math.max(left,right),index-al.get(level));
    }
}