class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return fun(nums,0,nums.length-1,1,0);
    }
    boolean fun(int[] nums, int i, int j, int turn, int sum){
        if(i>j){
            if(sum<0)return false;
            return true;
        }
        if(turn==2)return fun(nums,i+1,j,1,sum-nums[i])&&fun(nums,i,j-1,1,sum-nums[j]);
        return fun(nums,i+1,j,2,sum+nums[i])||fun(nums,i,j-1,2,sum+nums[j]);
    }
}