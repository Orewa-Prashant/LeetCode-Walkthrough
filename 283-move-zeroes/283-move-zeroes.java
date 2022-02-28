class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i!=0)nums[c++]=i;
        }
        while(c<nums.length)
            nums[c++]=0;
        
    }
}