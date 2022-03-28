class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+1][2];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return fun(prices,0,1,dp);
    }
    int fun(int[] prices, int i, int buy,int[][] dp){
        if(i>=prices.length)return 0;
        
        if(dp[i][buy]!=-1)return dp[i][buy];
        
        if(buy==1){
            return dp[i][buy]=Math.max(-prices[i]+fun(prices,i+1,0,dp),fun(prices,i+1,1,dp));
        }
        return dp[i][buy]=Math.max(prices[i]+fun(prices,i+2,1,dp),fun(prices,i+1,0,dp));
    }
}