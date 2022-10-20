class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<Map.Entry<String,Integer>> keys=new ArrayList<>(map.entrySet());
        Collections.sort(keys, new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                int res1=-o1.getValue()+o2.getValue();
                int res2=o1.getKey().compareTo(o2.getKey());
                return res1==0?res2:res1;
            }
        });
        
        // Comparator<Map.Entry<String,Integer>> comp = (a,b) -> a.getValue()-b.getValue();
        // Collections.sort(keys, comp);
        // System.out.println(keys);
        
        for(Map.Entry<String,Integer> kv : keys){
            if(k==0)break;
            ans.add(kv.getKey());
            k--;
        }
        return ans;
    }
}