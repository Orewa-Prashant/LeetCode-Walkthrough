class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length(),n=word2.length();
        int[][] dp=new int[m][n];
        for(int[] ar:dp)
            Arrays.fill(ar,-1);
        return fun(word1,word2,m-1,n-1,dp);
    }
    int fun(String s, String t, int i, int j, int[][] dp){
        if(j<0)return i+1;
        if(i<0)return j+1;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j))
            return dp[i][j]=fun(s,t,i-1,j-1,dp);
        return dp[i][j]=1+Math.min(Math.min(fun(s,t,i-1,j,dp),fun(s,t,i-1,j-1,dp)),fun(s,t,i,j-1,dp));
    }
} 