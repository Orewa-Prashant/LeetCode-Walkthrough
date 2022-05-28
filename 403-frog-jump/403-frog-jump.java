class Solution {
    public boolean canCross(int[] stones) {
        Map<String,Boolean> dp=new HashMap<>();
        return fun(0,0,stones,dp);
    }
    boolean fun(int i, int prev, int[] stones, Map<String,Boolean> dp){
        if(i==stones.length-1)return true;
        String s=i+","+prev;
        if(dp.containsKey(s))return dp.get(s);
        for(int j=i+1;j<stones.length;j++){
            if(stones[j]==stones[i]+prev && fun(j,prev,stones,dp)){
                dp.put(s,true);
                return true;
            }
            else if(stones[j]==stones[i]+prev+1 && fun(j,prev+1,stones,dp)){
                dp.put(s,true);
                return true;
            }
            else if(stones[j]==stones[i]+prev-1 && fun(j,prev-1,stones,dp)){
                dp.put(s,true);
                return true;
            }
        }
        dp.put(s,false);
        return false;
    }
}