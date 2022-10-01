class Solution {
    public int numDecodings(String s) {
        int[] t=new int[s.length()+1];
        Arrays.fill(t,-1);
        return fun(s,t);
    }
    int fun(String s,int[] t){
        if(s.length()==0)return 1;
        
        if(t[s.length()]!=-1)return t[s.length()];

        int ans=0;
        for(int i=0;i<2&&i<s.length();i++){
            String pre=s.substring(0,i+1);
            String ros=s.substring(i+1);
            if(pre.charAt(0)=='0'||Integer.parseInt(pre)>26)continue;
            ans+=fun(ros,t);
        }
        return t[s.length()]=ans;
    }
}