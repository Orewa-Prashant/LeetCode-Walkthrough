class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i<2)dp[i]=0;
            else{
                if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                    dp[i]=1+dp[i-1];
                }
                else dp[i]=0;
            }
        }
        int res=0;
        for(int i=0;i<dp.length;i++)
            res+=dp[i];
        return res;
    }
}