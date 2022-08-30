class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!h.contains(nums[i]))
                h.add(nums[i]);
            else return true;;
        }
        return false;
    }
}