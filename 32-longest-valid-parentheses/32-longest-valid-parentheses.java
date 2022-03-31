class Solution {
    public int longestValidParentheses(String s) {
        int left=0,right=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')left++;
            else right++;
            if(left==right)max=Math.max(max,2*right);
            else if(left<=right){
                left=0;
                right=0;
            }
        }
        left=0;right=0;
        
        for(int i=s.length()-1;i>-1;i--){
            char ch=s.charAt(i);
            if(ch=='(')left++;
            else right++;
            if(left==right)max=Math.max(max,2*right);
            else if(right<=left){
                left=0;
                right=0;
            }
        }
        return max;
    }
}