class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int val:weights){
            l=Math.max(l,val);
            r+=val;
        }
        
        int ans=r;
        while(l<=r){
            int m=(l+r)/2;
            int this_days=0;
            int currsum=0;
            for(int i:weights){
                currsum+=i;
                if(currsum>m){
                    currsum=i;
                    this_days++;
                }
            }
            this_days++;
            //System.out.println(m+" "+this_days);
            if(this_days<=days){
                ans=Math.min(ans,m);
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}