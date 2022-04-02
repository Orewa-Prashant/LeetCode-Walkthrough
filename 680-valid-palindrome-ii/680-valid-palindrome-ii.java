class Solution {
    public boolean validPalindrome(String s) {
        return fun(s,0,s.length()-1,1);
    }
    boolean fun(String s, int i, int j, int times){
        if(times<0)return false;
        if(i>=j)return true;
        if(s.charAt(i)==s.charAt(j))return fun(s,i+1,j-1,times);
        return fun(s,i+1,j,times-1)||fun(s,i,j-1,times-1);
    }
}