class Solution {
    int ans=1;
    public int maxProduct(String s) {
        fun(s,0,"","");
        return ans;
    }
    void fun(String s, int i, String a, String b){
        if(i==s.length()){
            if(check(a)&&check(b))
                ans=Math.max(ans,a.length()*b.length());
            return;
        }
        fun(s,i+1,a+s.charAt(i),b);
        fun(s,i+1,a,b+s.charAt(i));
        fun(s,i+1,a,b);
    }
    
    boolean check(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))return false;
        }
        return true;
    }
}