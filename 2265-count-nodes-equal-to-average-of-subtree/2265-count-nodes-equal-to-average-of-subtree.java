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
    class Pair{
        int height;
        int sum;
        Pair(){
            height=0;
            sum=0;
        }
        Pair(int a, int b){
            this.height=a;
            this.sum=b;
        }
    }
    int c=0;
    public int averageOfSubtree(TreeNode root) {
        Map<TreeNode,Integer> m=new HashMap<>();
        fun(root);
        return c;
    }
    Pair fun(TreeNode root){
        if(root==null)return new Pair();
        Pair l=fun(root.left);
        Pair r=fun(root.right);
        int hh=l.height+r.height+1;
        int ss=l.sum+r.sum+root.val;
        //System.out.print(root.val+" "+hh+" "+ss+" --");
        if(root.val==ss/hh)c++;
        return new Pair(hh,ss);
    }
    // int h(TreeNode root){
    //     if(root==null)return 0;
    //     int l=fun(root.left);
    //     int r=fun(root.right);
    // }
}