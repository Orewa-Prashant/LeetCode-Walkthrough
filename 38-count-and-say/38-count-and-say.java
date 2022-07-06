class Solution {
    public String countAndSay(int n) {
        StringBuilder s=new StringBuilder("1");
        if(n==1)return s.toString();
        for(int i=2;i<=n;i++){
            String kk=say(s);
            //System.out.println(kk);
            s=new StringBuilder(kk);
        }
        return s.toString();
    }
    String say(StringBuilder s){
        StringBuilder sb=new StringBuilder();
        char prev='-';
        int ct=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=prev){
                if(prev!='-'){
                    sb.append(ct+""+prev);
                }
                ct=1;
            }
            else ct++;
            prev=s.charAt(i);
        }
        sb.append(ct+""+prev);
        return sb.toString();
    }
}