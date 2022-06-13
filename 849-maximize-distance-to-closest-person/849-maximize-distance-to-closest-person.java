class Solution {
    public int maxDistToClosest(int[] seats) {
        int prev=0;
        int dif=0;
        int left=100000;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                dif=Math.max(dif,i-prev);
                prev=i;
                left=Math.min(left,i);
            }
        }
        
        // Traverse Backwards
        
        int right=0;
        for(int i=seats.length-1;i>=0;i--){
            if(seats[i]==1){
                dif=Math.max(dif,i-prev);
                prev=i;
                right=Math.max(right,i);
            }
        }
        
        return Math.max(left,Math.max(dif/2,seats.length-right-1));
    }
}