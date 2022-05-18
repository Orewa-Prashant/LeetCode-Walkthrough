class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=0;
        for(int i:nums)
            r=Math.max(r,i);
        
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+(r-l)/2;
            int sum=0;
            for(int val:nums){
                sum+=Math.ceil((float)val/m);
            }
            //System.out.println(sum+" "+m);
            if(sum<=threshold){
                ans=Math.min(ans,m);
                r=m-1;
            }
            else l=m+1;
        }
        return ans;
    }
}