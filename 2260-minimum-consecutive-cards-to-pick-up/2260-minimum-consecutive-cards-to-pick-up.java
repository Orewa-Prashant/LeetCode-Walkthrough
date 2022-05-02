class Solution {
    public int minimumCardPickup(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int j=0,i=0;
        int min=Integer.MAX_VALUE;
        for(;i<nums.length;i++){
            if(h.contains(nums[i])){
                while(nums[j]!=nums[i]){
                    if(h.contains(nums[j]))
                        h.remove(nums[j]);
                    j++;
                }
                h.remove(nums[j]);
                min=Math.min(min,i-j);
                j++;
            }
            h.add(nums[i]);
        }
        if(min==Integer.MAX_VALUE)return -1;
        return min+1;
    }
}