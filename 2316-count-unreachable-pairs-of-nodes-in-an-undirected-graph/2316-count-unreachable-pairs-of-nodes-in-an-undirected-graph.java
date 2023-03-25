class Solution {
    public long countPairs(int n, int[][] edges) {
        long ans=0;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        //System.out.println(map);
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> pp=new ArrayList<>();
        long tot=0;
        int[] ct=new int[]{0};
        for(int i=0;i<n;i++){
            if(set.contains(i))continue;
            ct[0]=0;
            if(map.get(i).size()==0){
                pp.add(1);
                tot++;
                continue;
            }
            dfs(map,i,set,ct);
            //if(ct[0]==0)continue;
            pp.add(ct[0]);
            tot+=ct[0];
        }
        //System.out.println(pp);
        //int[]
        
        for(int i:pp){
            ans+=(tot-i)*i;
        }
        return ans/2;
        
    }
    void dfs(HashMap<Integer,List<Integer>> map, int node, HashSet<Integer> set, int[] ct){
        if(set.contains(node)||map.get(node).size()==0)return;
        ct[0]++;
        set.add(node);
        for(int next:map.get(node))
        dfs(map,next,set,ct);
    }
}