class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        return fun(n,dp,0);
    }
    int fun(int n,int[] dp,int k){
        if(n==0||n==1)return 1;
        if(n<0)return 0;
        if(dp[n]!=0)return dp[n];
        int max=-1;
        for(int i=1;i<=n;i++){
            if(k<1&&i==n)continue;
            max=Math.max(max,i*fun(n-i,dp,k+1));
        }
        return dp[n]=max;
    }
}