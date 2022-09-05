class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currsum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(max<nums[i])max=nums[i];
            if(currsum<0)currsum=0;
            if(sum<currsum)sum=currsum;
        }
        if(max<0)return max;
        else return sum;
    }
}