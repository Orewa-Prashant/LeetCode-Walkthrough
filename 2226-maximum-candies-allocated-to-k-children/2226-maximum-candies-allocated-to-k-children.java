class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=0;
        long sum=0;
        for(int i:candies)
            sum+=i;
        int r=(int)(sum/k);
        
        int ans=0;  // Initially our answer is this
        while(l<=r){
            int m=l+(r-l)/2;
            long dis=k;
            if(m!=0){
                dis=0;
                for(int i:candies){
                    dis+=i/m;
                }
            }
            if(dis>=k){
                ans=Math.max(ans,m);
                l=m+1;
            }
            else r=m-1;
        }
        return ans;
    }
}