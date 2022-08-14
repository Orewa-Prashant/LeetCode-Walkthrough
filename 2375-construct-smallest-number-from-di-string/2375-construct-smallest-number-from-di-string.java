class Solution {                // 123434321
    String real="999999999";
    int ct=0;
    public String smallestNumber(String pattern) {
        StringBuilder ans=new StringBuilder();
        fun(pattern,ans,0,new HashSet<Integer>());
        return real;
    }
    void fun(String pat, StringBuilder ans, int i, HashSet<Integer> h){
        if(ct>0)return;
        if(pat.length()<i){
            real=ans.toString();
            ct++;
            return;
        }
        if(i==0){
            for(int j=1;j<=9;j++){
                ans.append(j);
                h.add(j);
                fun(pat,ans,i+1,h);
                h.remove(j);
                ans.deleteCharAt(ans.length()-1);
            }
        }
        else{
            char ch=pat.charAt(i-1);
            int ansch=ans.charAt(i-1)-'0';
            if(ch=='I'){
                for(int j=ansch+1;j<=9;j++){
                    if(h.contains(j))continue;
                    h.add(j);
                    ans.append(j);
                    fun(pat,ans,i+1,h);
                    h.remove(j);
                    ans.deleteCharAt(ans.length()-1);
                }
            }
            else{
                for(int j=1;j<ansch;j++){
                    if(h.contains(j))continue;
                    ans.append(j);
                    h.add(j);
                    fun(pat,ans,i+1,h);
                    h.remove(j);
                    ans.deleteCharAt(ans.length()-1);
                }
            }
        }
    }
}