class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,min=Integer.MAX_VALUE;
        int i=0,j=0;
        for(;i<nums.length;i++){
            sum+=nums[i];
            if(sum>=target){
                //min=Math.min(min,i-j+1);
                while(sum>=target){
                    sum-=nums[j];
                    j++;
                }
                min=Math.min(min,i-j+2);
            }
        }
        if(min==Integer.MAX_VALUE)return 0;
        return min;
    }
}