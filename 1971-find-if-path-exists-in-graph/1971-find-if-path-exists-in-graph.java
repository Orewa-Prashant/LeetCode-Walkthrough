class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(new ArrayList<Integer>());
        
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] used=new boolean[n];
        Boolean[] dp=new Boolean[n];
        return dfs(source, destination, list, used, dp);
    }
    boolean dfs(int s, int d, List<List<Integer>> list, boolean[] used, Boolean[] dp){
        if(s==d)return true;
        if(dp[s]!=null)return  dp[s];
        used[s]=true;
        boolean b=false;
        for(int i:list.get(s)){
            if(used[i])continue;
            b=b||dfs(i,d,list,used,dp);
            //if(b)return dp[s]=true;
        }
        used[s]=false;
        return dp[s]=b;
    }
}