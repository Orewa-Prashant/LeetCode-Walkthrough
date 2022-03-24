class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        String t="";
        for(int i=n-1;i>=0;i--){
            t+=s.charAt(i);
        }
        
        int[][] dp=new int[n+1][n+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==0||i==0)dp[i][j]=0;
                else{
                    if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                    else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[n][n];
    }
}