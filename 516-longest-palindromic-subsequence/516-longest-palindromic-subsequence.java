class Solution {
    public int longestPalindromeSubseq(String s) {
        String t="";
        int n=s.length();
        
        for(int i=s.length()-1;i>=0;i--)
            t+=s.charAt(i);
        Integer[][] dp=new Integer[n][n];
        return lcs(s,t,n-1,n-1,dp);
    }
    int lcs(String s, String t, int i, int j,Integer[][] dp){
        if(i<0||j<0)return 0;
        
        if(dp[i][j]!=null)return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j))return dp[i][j]= 1+lcs(s,t,i-1,j-1,dp);
        
        return dp[i][j]= Math.max(lcs(s,t,i-1,j,dp),lcs(s,t,i,j-1,dp));
        
    }
}