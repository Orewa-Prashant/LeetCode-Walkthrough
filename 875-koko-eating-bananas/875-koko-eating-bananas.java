class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1;
        for(int i:piles)
            r=Math.max(i,r);
        int ans=r;
        while(l<=r){
            int m=l+(r-l)/2;
            int tt=0;
            for(int i:piles){
                if(i%m==0)
                    tt+=i/m;
                else tt+=i/m+1;
            }
            if(tt<=h)
            ans=Math.min(ans,m);
            //System.out.println(ans+" "+tt+" "+m);
            if(tt<=h)r=m-1;
            else l=m+1;
        }
        return ans;
    }
}