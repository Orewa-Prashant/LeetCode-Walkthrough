class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // First creat an adjacency List
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            list.add(new ArrayList<Integer>());
        for(int i=0;i<prerequisites.length;i++)
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        //System.out.println(list);
        HashSet<Integer> done = new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] used=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!dfs(i,list,ans,done,used))
                return new int[]{};
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            res[i]=ans.get(i);
        return res;
    }
    boolean dfs(int node, List<List<Integer>> list, ArrayList<Integer> ans, HashSet<Integer> done, boolean[] used){
        if(used[node])return false;
        if(done.contains(node))return true;
        used[node]=true;
        for(int next:list.get(node)){
            if(!dfs(next,list,ans,done,used))
                return false;
        }
        done.add(node);
        ans.add(node);
        used[node]=false;
        return true;
    }
}