class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String,Set<Character>> map1 = new HashMap<>();
        String[] ar = s.split(" ");
        Map<Character,Set<String>> map2 = new HashMap<>();
        if(ar.length!= pattern.length())return false;
        
        for(int i=0;i<pattern.length();i++){
            String ss = ar[i];
            char ch = pattern.charAt(i);
            map1.putIfAbsent(ss, new HashSet<>());
            map1.get(ss).add(ch);
            
            map2.putIfAbsent(ch, new HashSet<>());
            map2.get(ch).add(ss);
        }
        
        // Now check one - one realtionship
        // System.out.println(map1);
        // System.out.println(map2);
        for(String sss: map1.keySet()){
            if(map1.get(sss).size()!=1)return false;
            else{
                char ch = map1.get(sss).iterator().next();
                // Now check in another map
                if(!(map2.get(ch).size() == 1 && map2.get(ch).iterator().next().equals(sss)))
                   return false;
            }
        }
        return true;
    }
}