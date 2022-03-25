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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] max=new int[]{0,0};
        fun(root,hm,max);
        int[] res=new int[max[1]];
        int i=0;
        for(int k:hm.keySet()){
            if(hm.get(k)==max[0])
                res[i++]=k;
        }
        
        return res;
    }
    int fun(TreeNode root, HashMap<Integer,Integer> hm, int[] max){
        if(root==null)return 0;
        int left=fun(root.left,hm,max);
        int right=fun(root.right,hm,max);
        int sum=left+right+root.val;
        hm.put(sum,hm.getOrDefault(sum,0)+1);
        if(max[0]<hm.get(sum)){
            max[0]=hm.get(sum);
            max[1]=0;
        }
        if(max[0]==hm.get(sum))max[1]++;
        return sum;
    }
}