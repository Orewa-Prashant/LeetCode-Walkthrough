class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
            else h.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            if(h.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}