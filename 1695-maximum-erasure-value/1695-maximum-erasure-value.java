class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> h= new HashSet<>();
        int max=0,i,j,sum=0;
        for(i=0,j=0;i<nums.length&&j<nums.length;){
            if(!h.contains(nums[i])){
                sum+=nums[i];
                h.add(nums[i++]);
                max=Math.max(max,sum);
            }
            else{
                sum-=nums[j];
                h.remove(nums[j++]);
            }
        }
        return max;
    }
}