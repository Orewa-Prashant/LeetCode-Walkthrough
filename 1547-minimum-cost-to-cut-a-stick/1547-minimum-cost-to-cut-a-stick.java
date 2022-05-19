class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        return fun(0,n,cuts,new HashMap<String,Integer>());
    }
    
    int fun(int l, int r, int[] cuts, HashMap<String,Integer> map){
        String s=l+" "+r;
        if(map.containsKey(s))return map.get(s);
        int min=Integer.MAX_VALUE;
        
        for (int i = 0; i < cuts.length; ++i) {
		    if (cuts[i] <= l || cuts[i] >= r) continue;
            int cost=r-l;
            min=Math.min(min,cost+fun(l,cuts[i],cuts,map)+fun(cuts[i],r,cuts,map));
        }
        min=min==Integer.MAX_VALUE?0:min;
        map.put(s,min);
        return min;
    }
}