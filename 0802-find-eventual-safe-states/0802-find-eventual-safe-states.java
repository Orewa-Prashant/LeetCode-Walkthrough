class Solution {
    static Set<Integer> set;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        set = new HashSet<>();
        int n=graph.length;
        boolean[] visited = new boolean[n];
        boolean[] pathVisited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited, pathVisited);
            }
            // System.out.println(set);
        }
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
    boolean dfs(int node, int[][] graph, boolean[] visited, boolean[] pathVisited){
        if(pathVisited[node])return false;
        // System.out.println(node);
        pathVisited[node] = true;
        for(int next : graph[node]){
            if(set.contains(next))continue;
            if(!dfs(next, graph, visited, pathVisited))return false;            
        }
        set.add(node);
        // System.out.println(node+"---"+set);
        pathVisited[node] = false;
        return true;
    }
}