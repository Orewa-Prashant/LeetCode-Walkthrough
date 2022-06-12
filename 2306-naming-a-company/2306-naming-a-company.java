class Solution {
    public long distinctNames(String[] ideas) {
        ArrayList<HashSet<String>> map=new ArrayList<>();
        for(int i=0;i<26;i++)
            map.add(new HashSet<String>());
        for(int i=0;i<ideas.length;i++){
            int id=ideas[i].charAt(0)-'a';
            map.get(id).add(ideas[i].substring(1));
        }
        //System.out.println(map);
        long res=0;
        for(int i=0;i<26;i++){
            for(int j=i+1;j<26;j++){
                long c1=0,c2=0;
                for(String v:map.get(i)){
                    if(!map.get(j).contains(v))
                        c1++;
                }
                for(String v:map.get(j)){
                    if(!map.get(i).contains(v))
                        c2++;
                }
                res+=c1*c2;
            }
        }
        return 2*res;
    }
}