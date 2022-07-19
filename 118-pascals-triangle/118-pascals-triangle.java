class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        l.add(new ArrayList());
        l.get(0).add(1);
        for(int i=1;i<n;i++){
            l.add(new ArrayList());
            for(int j=0;j<i+1;j++){
                if(j==0||j==i)
                l.get(i).add(1);
                else l.get(i).add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
            }
        }
        return l;
    }
}