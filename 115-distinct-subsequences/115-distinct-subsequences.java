class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m][n];
        
        for(int[] ar:dp)
            Arrays.fill(ar,-1);
        return fun(s,t,m-1,n-1,dp);
    }
    int fun(String s, String t, int m, int n, int[][] dp){
        if(n<0){
            return 1;
        }
        if(m<0)return 0;
        
        if(dp[m][n]!=-1)return dp[m][n];
        
        if(s.charAt(m)==t.charAt(n))
            return dp[m][n]=fun(s,t,m-1,n-1,dp)+fun(s,t,m-1,n,dp);
        return dp[m][n]=fun(s,t,m-1,n,dp);
    }
}