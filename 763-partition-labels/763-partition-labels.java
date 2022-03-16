class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> ans = new ArrayList<>();
        HashSet<Character> set = new HashSet();
        int limit=-1,left=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                limit=Math.max(map.get(s.charAt(i)),limit);
            }
            if(i==limit){
                ans.add(limit-left+1);
                left=limit+1;
            }
        }
        return ans;
    }
}