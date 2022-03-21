class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int max=0,l=0,i;
        for(i=0;i<s.length();i++){
            if(!h.containsKey(s.charAt(i)))
               h.put(s.charAt(i),i); 
            else {
                if(max<i-l)max=i-l;
                l=Math.max(h.get(s.charAt(i))+1,l);
                h.put(s.charAt(i),i); 
            }
        }
        if(max<i-l)max=i-l;
        return max;
    }
}
