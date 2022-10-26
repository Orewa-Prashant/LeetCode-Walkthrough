class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> h= new HashMap<>();
        int sum=0;
        h.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sum%=k;
            if(h.containsKey(sum)){
                if(i-h.get(sum)>=2)return true;
                else continue;
            }
                
            else
            h.put(sum,i); 
        }
        return false;
    }
}