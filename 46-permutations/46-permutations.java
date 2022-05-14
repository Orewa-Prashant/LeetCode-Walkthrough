class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ap=new ArrayList<>();
        fun(nums,ap,ans);
        return ans;
    }
    void fun(int[] nums, List<Integer> ap, List<List<Integer>> ans){
        if(ap.size()==nums.length){
            ans.add(new ArrayList<Integer>(ap));
            return;
        }
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>10)continue;
            val=nums[i];
            ap.add(nums[i]);
            nums[i]=11;
            fun(nums,ap,ans);
            ap.remove(ap.size()-1);
            nums[i]=val;
        }
    }
}