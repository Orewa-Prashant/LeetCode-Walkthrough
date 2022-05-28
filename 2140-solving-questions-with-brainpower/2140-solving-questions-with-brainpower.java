class Solution {
    public long mostPoints(int[][] questions) {
        Long[] dp=new Long[questions.length];
        return fun(questions,0,dp);
    }
    long fun(int[][] nums, int i,Long[] dp){
        if(i>=nums.length)return  0;
        if(dp[i]!=null)return dp[i];
        long take=0;
        take=nums[i][0]+fun(nums,i+nums[i][1]+1,dp);
        long not=fun(nums,i+1,dp);
        return dp[i]=Math.max(not,take);
    }
}