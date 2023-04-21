class Solution {
    int mod=1000000007;
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        return fun(n, minProfit, group, profit, 0, new Integer[profit.length+1][n+1][minProfit+1]);
    }
    int fun(int n, int min, int[] grp, int[] prf, int i, Integer[][][] dp){
        if(n<0)return 0;
        if(i==prf.length){
            return min<=0?1:0;
        }
        if(min<0){
            min=0;
        }
        if(dp[i][n][min]!=null) return dp[i][n][min];
        int take =  fun(n-grp[i],min-prf[i],grp, prf,i+1, dp);
        int not = fun(n,min, grp, prf, i+1, dp);
        return dp[i][n][min] = (take+not)%mod;
        // return dp[i][n][sum] = (take+not)%mod;
    }
    
    // if(n<0 || i>prf.length)return 0;
    //     int take = 0;
    //     if(i<prf.length) take =  fun(n-grp[i],min,grp, prf,i+1, sum+prf[i], dp);
    //     int not = 0;
    //     if(i<prf.length) not = fun(n,min, grp, prf, i+1,sum, dp);
    //     if(sum>=min)
    //     return dp[i][n][sum] = (1+take+not)%mod;
    //     return dp[i][n][sum] = (take+not)%mod;
}