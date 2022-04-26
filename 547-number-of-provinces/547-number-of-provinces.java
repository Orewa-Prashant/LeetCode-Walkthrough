class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer,List<Integer>> adjList=new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            adjList.put(i,new ArrayList<Integer>());
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    adjList.get(i).add(j);
                }
            }
        }
        
        // Apply loop over every node
        boolean[] used=new boolean[n];
        
        int ans=0;
        for(int i=0;i<n;i++){
            if(!used[i]){
                dfs(i,adjList,used);
                ans++;
            }
        }
        return ans;
    }
    void dfs(int node, Map<Integer,List<Integer>> adjList, boolean[] used){
        used[node]=true;
        List<Integer> nbrs=adjList.get(node);
        for(int next:nbrs){
            if(!used[next])
                dfs(next,adjList,used);
        }
    }
}