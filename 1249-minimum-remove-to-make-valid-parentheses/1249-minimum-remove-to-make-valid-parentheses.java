class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans=new StringBuilder();
        int lc=0,rc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')lc++;
            else if(ch==')')rc++;
            if(rc>lc)
                rc--;
            else ans.append(ch);
        }
        for(int j=ans.length()-1;j>=0;j--){
            if(ans.charAt(j)=='('){
                ans.deleteCharAt(j);
                lc--;
            }
            if(lc==rc)break;
        }
        return ans.toString();
    }
}