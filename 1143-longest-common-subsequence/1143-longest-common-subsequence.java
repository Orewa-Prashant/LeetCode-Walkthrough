class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m][n];
        for(int[] ar:dp)
            Arrays.fill(ar,-1);
        return fun(text1,text2,m-1,n-1,dp);
    }
    int fun(String a, String b, int ind1, int ind2, int[][] dp){
        if(ind1<0||ind2<0)return 0;
        
        if(dp[ind1][ind2]!=-1)return dp[ind1][ind2];
        
        if(a.charAt(ind1)==b.charAt(ind2))
            return dp[ind1][ind2]=1 + fun(a,b,ind1-1,ind2-1,dp);
        return dp[ind1][ind2]=Math.max(fun(a,b,ind1-1,ind2,dp),fun(a,b,ind1,ind2-1,dp));
    }
}