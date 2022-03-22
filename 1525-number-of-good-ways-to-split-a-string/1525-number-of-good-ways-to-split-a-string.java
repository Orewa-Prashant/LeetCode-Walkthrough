class Solution {
    public int numSplits(String s) {
        HashSet<Character> h=new HashSet<>();
        int n=s.length();
        int[] pref=new int[n];
        int[] suff=new int[n];
        for(int i=0;i<n;i++){
            h.add(s.charAt(i));
            pref[i]=h.size();
        }
        h.clear();
        for(int i=n-1;i>=0;i--){
            h.add(s.charAt(i));
            suff[i]=h.size();
        }
        
        int res=0;
        for(int i=0;i<n-1;i++){
            if(pref[i]==suff[i+1])
                res++;
        }
        return res;
    }
    private int count(String s){
        HashSet<Character> h= new HashSet<>();
        int d=0;
        for(int i=0;i<s.length();i++){
            if(!h.contains(s.charAt(i))){
                h.add(s.charAt(i));d++;
            }
        }
        return d;
    }
    private int play(String s,int i,int[] t){
        if(i==s.length())return 0;
        if(t[i]!=-1)return t[i];
        String p=s.substring(0,i);
        String k=s.substring(i);
        int pc=count(p);
        int kc=count(k);
        if(pc==kc)
            return t[i]=1+play(s,i+1,t);
        else return t[i]=play(s,i+1,t);
    }
}