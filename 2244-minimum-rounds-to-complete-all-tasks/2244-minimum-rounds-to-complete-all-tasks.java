class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int val:map.values()){
            if(val==1)return -1;
            else{
                res+=Math.ceil((float)val/3);
            }
        }
        return res;
    }
}