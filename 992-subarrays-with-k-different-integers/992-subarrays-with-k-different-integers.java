class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    int atMost(int[] nums, int k){
        int i=0,j=0,len=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            while(h.size()>k){
                h.put(nums[j],h.get(nums[j])-1);
                if(h.get(nums[j])==0)h.remove(nums[j]);
                j++;
            }
            len+=i-j+1;
        }
        return len;
    }
}