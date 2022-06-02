class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        int ways=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=0;
            for(int j=0;j<i;j++){
                ways=dp[j]*dp[i-j-1];
                sum+=ways;
            }
            dp[i]=sum;
        }
        return dp[n];
    }
}