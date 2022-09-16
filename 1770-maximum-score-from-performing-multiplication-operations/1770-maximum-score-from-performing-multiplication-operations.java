class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int i=multipliers.length;
        Integer[][] dp=new Integer[i][i];
        return fun(nums,multipliers,0,nums.length-1,0, dp);
    }
    int fun(int[] nums, int[] mul, int i, int j, int n, Integer[][] dp){
        if(n==mul.length)return 0;
        if(dp[i][n]!=null)return dp[i][n];
        return dp[i][n]=Math.max(mul[n]*nums[i]+fun(nums,mul,i+1,j,n+1,dp),mul[n]*nums[j-(n-i)]+fun(nums,mul,i,j,n+1,dp));
    }
}