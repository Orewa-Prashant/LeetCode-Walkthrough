class Solution {
      List<List<Integer>> l=new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> p= new ArrayList<>();
        //Arrays.sort(nums);
        boolean[] visited= new boolean[nums.length];
        play(nums,p,visited);
        return l;
    }
    private void play(int[] nums,List<Integer> p,boolean[] visited){
        if(p.size()==nums.length){
            l.add(new ArrayList<Integer>(p));
            return;
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(visited[i]||h.contains(nums[i]))continue;
            h.add(nums[i]);
            visited[i]=true;
            p.add(nums[i]);
            play(nums,p,visited);
            p.remove(p.size()-1);
            visited[i]=false;
        }
    }
}