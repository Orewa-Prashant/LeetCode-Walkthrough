class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a: dp)
            Arrays.fill(a,Integer.MAX_VALUE);
        if(grid[0][0]==0){
            q.add(new int[]{0,0,1});
            dp[0][0]=1;
        }
        else return -1;
        while(!q.isEmpty()){
            int[] a = q.remove();
            // if(a[0]==grid.length-1 && a[1]==grid[0].length-1) return a[2];
            for(int i=Math.max(0,a[0]-1);i<=Math.min(grid.length-1,a[0]+1);i++){
                for(int j=Math.max(0,a[1]-1);j<=Math.min(grid[0].length-1,a[1]+1);j++){
                    if(!(i==a[0] && j==a[1]) && grid[i][j]==0 && dp[i][j]>a[2]+1){
                        q.add(new int[]{i,j,a[2]+1});
                        dp[i][j]=a[2]+1;
                    }
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1] == Integer.MAX_VALUE ? -1 : dp[grid.length-1][grid[0].length-1];
    }
}