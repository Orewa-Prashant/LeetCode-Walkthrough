class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            int max=-1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            if(max==-1)dp[i]=1;
            else
            dp[i]=max+1;
        }
        int ans=0;
        for(int i=0;i<dp.length;i++)
            ans=Math.max(ans,dp[i]);
        return ans;
    }
}