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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:to_delete)
            h.add(i);
        List<TreeNode> ans = new ArrayList<>();
        if(fun(root,ans,h)!=null)
        ans.add(root);
        return ans;
    }
    TreeNode fun(TreeNode root, List<TreeNode> ans, HashSet<Integer> h){
        if(root==null)return null;
        TreeNode left=fun(root.left,ans,h);
        TreeNode right=fun(root.right,ans,h);
        root.left=left;
        root.right=right;
        if(h.contains(root.val)){
            if(root.left!=null){
                ans.add(root.left);
            }
            if(root.right!=null){
                ans.add(root.right);
            }
            h.remove(root.val);
            return null;
        }
        
        return root;
    }
}