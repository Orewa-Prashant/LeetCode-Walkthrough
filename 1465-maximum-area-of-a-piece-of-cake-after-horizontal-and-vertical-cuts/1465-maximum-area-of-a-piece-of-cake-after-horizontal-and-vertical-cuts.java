class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long maxH=0,maxW=0;
        long prev=0;
        for(int i:horizontalCuts){
            maxH=Math.max(maxH,i-prev);
            prev=i;
        }
        maxH=Math.max(maxH,h-prev);
        
        prev=0;
        for(int i:verticalCuts){
            maxW=Math.max(maxW,i-prev);
            prev=i;
        }
        maxW=Math.max(maxW,w-prev);
        
        return (int)((maxW*maxH)%1000000007);
    }
}