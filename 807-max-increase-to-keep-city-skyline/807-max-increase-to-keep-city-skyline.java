class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] north=new int[n];  // An Array to store maximum lengths from each column ( viewing from north)
        int[] west=new int[n];   // An Array to store maximum lengths from each row ( viewing from west)
        
        // Loop to assign north and  west arrays
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                west[i]=Math.max(west[i],grid[i][j]);
                north[j]=Math.max(north[j],grid[i][j]);
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // Add the maximum possible increase
                res+=Math.min(north[j],west[i])-grid[i][j];   
            }
        }
        return res;
    }
}