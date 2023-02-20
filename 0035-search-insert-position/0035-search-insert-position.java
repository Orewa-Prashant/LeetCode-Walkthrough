class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])return nums.length;
        else if(target<nums[0])return 0;
        else{
            int b=0,l=nums.length-1;
            int m=0;
            while(b<=l){
                m=(l+b)/2;
                if(nums[m]==target)return m;
                else if(nums[m]<target){
                    if(nums[m+1]>target)return m+1;
                    b=m+1;
                }
                else{
                    if(nums[m-1]<target)return m;
                    l=m-1;
                }
            }
        }
        return -1;
    }
}