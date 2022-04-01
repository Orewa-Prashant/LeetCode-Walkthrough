class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0,end=0;
        for(int i=0;i<n-1;i++){
            int len1=expandAroundCenters(s,i,i);
            int len2=0;
            if(s.charAt(i)==s.charAt(i+1))
            len2=expandAroundCenters(s,i,i+1);
            int len=Math.max(len1,len2);

            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    int expandAroundCenters(String s, int l, int r){
        while(l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}