class Solution {
    int mod=1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] dp=new Integer[n+1][target+1];
        return fun(n,k,target,dp);
    }
    int fun(int n, int k, int target, Integer[][] dp){
        if(target<0)return 0;
        if(n==0){
            return target==0?1:0;
        }
        if(dp[n][target]!=null)return dp[n][target];
        int ans=0;
        for(int i=1;i<=k;i++){
            ans=(ans+fun(n-1,k,target-i,dp)%mod)%mod;
        }
        return dp[n][target]=ans;
    }
}