class Solution {
    public int longestSubarray(int[] nums) {
        int zeroct=0,max=0,i,j;
        for(i=0,j=0;i<nums.length;i++){
            if(nums[i]==0)zeroct++;
            if(zeroct==2){
                max=Math.max(max,i-j-1);
                while(nums[j]!=0)
                    j++;
                j++;
                zeroct--;
            }
        }
        return Math.max(max,i-j-1);
    }
}