class Solution {
    public long numberOfWays(String s) {
        long[][] dp1=new long[s.length()][3];
        long[][] dp2=new long[s.length()][3];
        for(long[] a:dp1)
            Arrays.fill(a,-1);
        for(long[] a:dp2)
            Arrays.fill(a,-1);
        return fun(s,"101",s.length()-1,2,dp1)+fun(s,"010",s.length()-1,2,dp2);
    }
    long fun(String s, String t, int m, int n, long[][] dp){
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