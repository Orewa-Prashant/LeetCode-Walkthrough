class Solution {
    public boolean matchReplacement(String s, String sub, char[][] mappings) {
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        for(char[] c:mappings){
            map.putIfAbsent(c[0],new HashSet<Character>());
            map.get(c[0]).add(c[1]);
        }
        //System.out.println(map);
        for(int i=0;i<=s.length()-sub.length();i++){
            int j=i;
            for(;j<i+sub.length();j++){
                char c=s.charAt(j);
                char v=sub.charAt(j-i);
                //System.out.println(c+" "+v);
                if(c==v)
                continue;
                else{
                    if(!map.containsKey(v))
                        break;
                    else{
                        if(!map.get(v).contains(c)){
                            //System.out.println("hi");
                            break;
                        }
                    }
                }
            }
            if(j==i+sub.length())return true;
        }
        return false;
    }
}