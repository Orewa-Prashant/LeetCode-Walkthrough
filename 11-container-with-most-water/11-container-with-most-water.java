class Solution {
    public int maxArea(int[] h) {
        int left=0,right=h.length-1;
        int max=0;
        while(left<right){
            max=Math.max(max,(right-left)*Math.min(h[left],h[right]));
            if(h[left]<=h[right])left++;
            else right--;
        }
        max=Math.max(max,(right-left)*Math.min(h[left],h[right]));
        return max;
    }
}