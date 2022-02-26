class Solution {
    public List<Long> maximumEvenSplit(long Sum) {
        List<Long> ans=new ArrayList<>();
        if(Sum%2!=0)return ans;
        long i;
        for(i=2;i<=Sum;i=i+2){
            ans.add(i);
            Sum-=i;
        }
        if(Sum!=0)
        ans.set(ans.size()-1,ans.get(ans.size()-1)+Sum);
        return ans;
    }
    
}