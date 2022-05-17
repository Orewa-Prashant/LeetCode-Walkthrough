class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l=1;
        int min=Integer.MAX_VALUE;
        for(int val:time)
            min=Math.min(min,val);
        long r=(long)min*totalTrips;

        long ans=Long.MAX_VALUE;
        
        while(l<=r){
            long m=l+(r-l)/2;
            long completedTrips=0;
            for(int val:time){
                completedTrips+=m/val;
            }
            if(completedTrips>=totalTrips){
                ans=Math.min(ans,m);
                r=m-1;
            }
            else l=m+1;
        }
        return ans;
    }
}