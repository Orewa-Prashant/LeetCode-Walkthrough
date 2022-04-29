class Solution {
    public boolean canFinish(int numCourses , int[][] prerequisites) {
        Map<Integer,List<Integer>> list=new HashMap<>();
        int n=prerequisites.length;
        for(int i=0;i<n;i++){
            if(!list.containsKey(prerequisites[i][0]))
                list.put(prerequisites[i][0],new ArrayList<Integer>());
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        //System.out.println(list);
        HashSet<Integer> h=new HashSet<>();
        boolean[] used=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            //if(used[i])continue;
            //System.out.println(i);
            if(!dfs(list,i,used,h))
                return false;
            h.add(i);
            //System.out.println(i);
        }
        return true;
    }
    
    boolean dfs(Map<Integer,List<Integer>> list, int node, boolean[] used, HashSet<Integer> h){
        
        if(used[node])return false;
        if(!list.containsKey(node)||h.contains(node))return true;
        used[node]=true;
        
        for(int next:list.get(node)){
            if(!dfs(list,next,used,h))
                return false;
        }
        used[node]=false;
        return true;
    }
}