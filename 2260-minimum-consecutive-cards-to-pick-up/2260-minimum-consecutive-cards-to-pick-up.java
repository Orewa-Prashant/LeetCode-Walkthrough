class Solution {
    public int minimumCardPickup(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int j=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                res=Math.min(res,i-h.get(nums[i]));
            }
            h.put(nums[i],i);
        }
        if(res==Integer.MAX_VALUE)return -1;
        return res+1;
    }
}