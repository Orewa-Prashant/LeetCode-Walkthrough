class Solution {
    public int trap(int[] h) {
        int[] min=new int[h.length];
        int[] max=new int[h.length];
        
        int minh=0,maxh=0;
        for(int i=0;i<h.length;i++){
            min[i]=minh;
            minh=Math.max(minh,h[i]);
        }
        
        for(int i=h.length-1;i>=0;i--){
            max[i]=maxh;
            maxh=Math.max(maxh,h[i]);
        }
        int ans=0;
        for(int i=0;i<h.length;i++){
            if(Math.min(max[i],min[i])-h[i]>0)ans+=Math.min(max[i],min[i])-h[i];
        }
        return ans;
    }
}