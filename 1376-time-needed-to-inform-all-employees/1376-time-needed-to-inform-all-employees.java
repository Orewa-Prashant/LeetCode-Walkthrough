class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Queue<int[]> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<manager.length;i++)list.add(new ArrayList<>());
        for(int i=0;i<manager.length;i++){
            if(manager[i]!=-1)
            list.get(manager[i]).add(i);
        }
        
        q.add(new int[]{headID, 0});
        int ans=0;
        while(!q.isEmpty()){
            int[] a = q.remove();
            ans = Math.max(ans, a[1]);
            for(int i : list.get(a[0])){
                q.add(new int[]{i, a[1]+informTime[a[0]]});
            }
        }
        return ans;
    }
}