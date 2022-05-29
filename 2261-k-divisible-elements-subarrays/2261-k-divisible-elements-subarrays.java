class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int ct=0;
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                Pair<Integer,String> pa=fun(nums,i,j,k,p);
                if(pa.getKey()==1)h.add(pa.getValue());
            }
        }
        return h.size();
    }
    Pair<Integer,String> fun(int[] nums, int i, int j, int k, int p){
        StringBuilder s=new StringBuilder();
        for(int a=i;a<=j;a++){
            s.append(nums[a]+"");
            s.append('.');
            if(nums[a]%p==0)k--;
            if(k<0)return new Pair(0,s.toString());
        }
        return new Pair(1,s.toString());
    }
}