class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp=new int[strs.length][m+1][n+1];
        for(int[][] ap:dp){
            for(int[] a:ap)
                Arrays.fill(a,-1);
        }
        return fun(strs,0,m,n,dp);
    }
    int fun(String[] strs,int i, int m, int n, int[][][] dp){
        if(i==strs.length)return 0;
        
        if(dp[i][m][n]!=-1)return dp[i][m][n];
        int not=fun(strs,i+1,m,n,dp);
        int take=0;
        int z=0,o=0,c=0;
        for(int j=0;j<strs[i].length();j++)
            c=(strs[i].charAt(j)=='0')?z++:o++;
        if(z<=m && o<=n)
        take=1+fun(strs,i+1,m-z,n-o,dp);
        return dp[i][m][n]=Math.max(take,not);
    }
}