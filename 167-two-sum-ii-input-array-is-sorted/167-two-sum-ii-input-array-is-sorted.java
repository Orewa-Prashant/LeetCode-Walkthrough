class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int j=nums.length-1,i=0;i<j;){
            if(nums[i]+nums[j]==target)
                return new int[]{i+1,j+1};
            if(nums[i]+nums[j]>target)j--;
            else if(nums[i]+nums[j]<target)i++;
        }
        return nums;
    }
}