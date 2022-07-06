class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less=new ArrayList<>();
        List<Integer> more=new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        
        int eq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot)
            {
                equal.add(nums[i]);
            }
            else if(nums[i] > pivot)
            {
                more.add(nums[i]);
            }
            else
                less.add(nums[i]);
        }
        
        int result[] = new int[nums.length];
        int k = 0;
        for(Integer itr: less)
            result[k++] = itr;
        for(Integer itr: equal)
            result[k++] = itr;
        for(Integer itr: more)
            result[k++] = itr;
        return result;
    }
}