class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i]-nums[0];
        }
        return res;
    }
}