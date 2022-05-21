class Solution {
    public int maxDistance(int[] nums, int[] arr) {
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            int l=i,r=arr.length-1;
            int id=-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(arr[m]<nums[i]){
                    r=m-1;
                }
                else{
                    id=Math.max(id,m);
                    l=m+1;
                }
            }
            if(id!=-1)
            ans=Math.max(ans,id-i);
        }
        return ans;
    }
}