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
 private List<List<Integer>> result = new ArrayList<List<Integer>>();

public List<List<Integer>> pathSum(TreeNode root, int sum) {
    helper(new ArrayList<Integer>(), root, sum);
    return result;
}

private void helper(List<Integer> list, TreeNode root, int sum) {
    if (root == null) return;
    list.add(root.val);
    sum -= root.val;
    if (root.left == null && root.right == null) {
        if (sum == 0) result.add(list);
        return;
    }
    helper(new ArrayList<Integer>(list), root.left, sum);
    helper(new ArrayList<Integer>(list), root.right, sum);
}
 */
class Solution {
    List<List<Integer>> l= new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)return l;
        List<Integer> p= new ArrayList<>();
        play(root,targetSum,p);
        return l;
    }
    private void play(TreeNode root, int t,List<Integer> p){
        if(root.left==null&&root.right==null){
            
            if(t==root.val){
                p.add(root.val);
                l.add(new ArrayList<Integer>(p));
                p.remove(p.size()-1);
            }
            
            return;
        }
        p.add(root.val);
        if(root.left!=null)
        play(root.left,t-root.val,p);
        if(root.right!=null)
        play(root.right,t-root.val,p);
        p.remove(p.size()-1);
    }
}