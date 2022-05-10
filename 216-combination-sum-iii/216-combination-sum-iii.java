class Solution {
    List<List<Integer>> l= new ArrayList();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> p= new ArrayList<>();
        boolean[] b= new boolean[9];
        sum(n,p,k,1,b);
        return l;
    }
    private void sum(int n,List<Integer> p, int k,int start,boolean[] b){
        if(n<0)return;
        if(k==0&&n==0){
            l.add(new ArrayList<Integer>(p));
            return;
        }
        
        for(int i=start;i<=9;i++){
            if(b[i-1])continue;
            //if(i>start&&nums[i]==nums[i-1])continue;
            b[i-1]=true;
            p.add(i);
            sum(n-i,p,k-1,i+1,b);
            p.remove(p.size()-1);
            b[i-1]=false;
        }
    }
}