class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max=0;
        for(int i=1;i<special.length;i++){
            max=Math.max(max,special[i]-special[i-1]-1);
        }
        max=Math.max(max,special[0]-bottom);
        max=Math.max(max,top-special[special.length-1]);
        return max;
    }
}