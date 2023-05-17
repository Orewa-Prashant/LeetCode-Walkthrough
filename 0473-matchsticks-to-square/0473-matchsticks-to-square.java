class Solution {
    public boolean makesquare(int[] nums) {
        int k=4;
        int sum = 0;
        for(int num:nums)sum += num;
        if(k <= 0 || sum%k != 0)return false;
        int[] visited = new int[nums.length];
        return canPartition(nums, visited, 0, k, 0, sum/k);
    }
    public boolean canPartition(int[] nums, int[] visited, int start_index, int k, int cur_sum, int target){

        if(k==1)return true;
        if(cur_sum>target)return false;

        if(cur_sum == target)return canPartition(nums, visited, 0, k-1, 0, target);
        for(int i = start_index; i<nums.length; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                if(canPartition(nums, visited, i+1, k, cur_sum + nums[i], target))return true;
                visited[i] = 0;
            }
        }
        return false;
    }
}