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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(root,ans,0);
        return ans;
    }
    void fun(TreeNode root,List<List<Integer>> ans,int level){
        if(root==null)return;
        if(ans.size()==level){
            ans.add(new ArrayList<Integer>());
            ans.get(level).add(root.val);
        }
        else{
            ans.get(level).add(root.val);
        }
        fun(root.left,ans,level+1);
        fun(root.right,ans,level+1);
    }
}