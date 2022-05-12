class Solution {
    int c=0;
    public int numSquarefulPerms(int[] nums) {
        boolean[] used=new boolean[nums.length];
        fun(nums,used,new ArrayList<Integer>());
        return c;
        
    }
    void fun(int[] nums, boolean[] used, List<Integer> ap){
        if(ap.size()==nums.length){
            c++;
            return;
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(used[i] || h.contains(nums[i]))continue;
            if((ap.size()>0&&isSquare(nums[i]+ap.get(ap.size()-1)))||ap.size()==0)
            {
                used[i]=true;
                h.add(nums[i]);
                ap.add(nums[i]);
                fun(nums,used,ap);
                ap.remove(ap.size()-1);
                used[i]=false;
            }
        }
    }
    boolean isSquare(int n){
        int i=0;
        for(;i*i<n;i++);
        if(i*i==n)return true;
        return false;
    }
}