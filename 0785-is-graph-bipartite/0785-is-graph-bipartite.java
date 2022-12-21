class Solution {
    public boolean isBipartite(int[][] graph) {        
        int[] colors = new int[graph.length+1]; // to mark nodes which have been colored
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(colors[i] != 0)continue;
            qu.add(i);
            colors[i] = 1;
            while(!qu.isEmpty()){
                int curr = qu.poll();
                int color = colors[curr];
                for(int next : graph[curr]){
                    if(colors[next]==0){
                        if(color == 1){
                            qu.add(next);
                            colors[next] = 2;
                        }
                        else{
                            qu.add(next);
                            colors[next] = 1;
                        }
                    }
                    else if(colors[next] == color){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}