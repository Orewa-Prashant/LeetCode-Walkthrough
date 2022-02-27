class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(h.containsKey(ch))
                h.put(ch,h.get(ch)+1);
            else h.put(ch,1);
        }
        int c=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!h.containsKey(ch))c++;
            else{
                if(h.get(ch)<=0)c++;
                else{
                    h.put(ch,h.get(ch)-1);
                }
            }
        }
        for(int v:h.values()){
            c+=v;
        }
        return c;
    }
}