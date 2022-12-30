class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths=new ArrayList<>();
        int dest=graph.length-1;
        ArrayList<Integer> ap= new ArrayList<Integer>();
        ap.add(0);
        
        dfs(graph,0,dest,ap, paths);
        
        return paths;
    }
    void dfs(int[][] graph, int node, int dest, ArrayList<Integer> ap, List<List<Integer>> paths){
        if(node==dest){
            paths.add(new ArrayList<Integer>(ap));
            return;
        }
        for(int nextNode: graph[node]){
            ap.add(nextNode);
            dfs(graph,nextNode,dest,ap,paths);
            ap.remove(ap.size()-1);
        }
    }
}