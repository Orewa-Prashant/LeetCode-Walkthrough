class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> h=new HashSet<>();
        h.add(0);
        //boolean[] ans=new boolean[]{false};
        fun(rooms,h,0);
        return h.size()==rooms.size()?true:false;
    }
    void fun(List<List<Integer>> rooms, HashSet<Integer> h, int room){
        // if(h.size()==rooms.size()){
        //     ans[0]=true;
        //     return;
        // }
        
        for(int next:rooms.get(room)){
            if(!h.contains(next)){
                h.add(next);
                fun(rooms,h,next);
            }
        }
    }
}