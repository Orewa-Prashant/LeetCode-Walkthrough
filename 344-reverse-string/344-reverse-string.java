class Solution {
    public void reverseString(char[] s) {
        play(s,0,s.length-1);
    }
    private void play(char[] s, int l, int r){
        if(l>=r)return;
        
        
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        play(s,l+1,r-1);
    }
}