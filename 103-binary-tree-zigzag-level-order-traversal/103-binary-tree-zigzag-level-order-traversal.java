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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        if(root==null)return ans;
        qu.add(root);
        boolean level=true;
        while(!qu.isEmpty()){
            List<Integer> ap=new ArrayList<>();
            int len=qu.size();
            for(int i=0;i<len;i++){
                if(qu.peek().left!=null)qu.add(qu.peek().left);
                if(qu.peek().right!=null)qu.add(qu.peek().right);
                if(level)
                    ap.add(qu.poll().val);
                else
                    ap.add(0,qu.poll().val);
            }
            level=!level;
            ans.add(ap);
        }
        return ans;
    }
}