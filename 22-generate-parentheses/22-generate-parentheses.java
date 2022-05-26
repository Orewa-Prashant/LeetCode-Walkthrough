class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l= new ArrayList<String>();
        play(0,0,n,"",l);
        return l;
    }
    private void play(int oc,int cc,int n,String ss,List l){
        if(oc==n&&cc==n){
            l.add(ss);
            return;
        }
        if(oc<n){
            play(oc+1,cc,n,ss+'(',l);
        }
        if(cc<oc){
            play(oc,cc+1,n,ss+')',l);
        }
    }
}