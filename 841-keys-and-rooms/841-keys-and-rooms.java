class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> h=new HashSet<>();
        h.add(0);
        boolean[] ans=new boolean[]{false};
        fun(rooms,h,0,ans);
        return ans[0];
    }
    void fun(List<List<Integer>> rooms, HashSet<Integer> h, int room, boolean[] ans){
        if(h.size()==rooms.size()){
            ans[0]=true;
            return;
        }
        
        for(int next:rooms.get(room)){
            if(!h.contains(next)){
                h.add(next);
                fun(rooms,h,next,ans);
            }
        }
    }
}