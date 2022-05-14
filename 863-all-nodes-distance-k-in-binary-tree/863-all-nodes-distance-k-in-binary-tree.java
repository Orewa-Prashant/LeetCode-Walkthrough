/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        HashMap<TreeNode,List<TreeNode>> map=new HashMap<>();
        fun(root,null,map);
        HashSet<TreeNode> used=new HashSet<>();
        //System.out.println(map);
        //dfs(map,k,ans,target,used);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        while(!q.isEmpty()){
            if(k==0){
                while(!q.isEmpty()){
                    ans.add(q.poll().val);
                }
            }
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                used.add(node);
                for(TreeNode nd:map.get(node)){
                    if(!used.contains(nd))
                        q.offer(nd);
                }
            }
            k--;
        }
        return ans;
    }
    void fun(TreeNode root,TreeNode par, HashMap<TreeNode,List<TreeNode>> map){
        if(root==null)return;
        if(!map.containsKey(root))
            map.put(root,new ArrayList<TreeNode>());
        if(par!=null){
            map.get(par).add(root);
            map.get(root).add(par);
        }
        fun(root.left,root,map);
        fun(root.right,root,map);
        
    }
    
    void dfs(HashMap<TreeNode,List<TreeNode>> map, int k, List<Integer> ans, TreeNode target, HashSet<TreeNode> used){
        if(k==0){
            ans.add(target.val);
            return;
        }
        used.add(target);
        for(TreeNode node:map.get(target)){
            if(!used.contains(node))
            dfs(map,k-1,ans,node,used);
        }
        used.remove(target);
    }
    
}