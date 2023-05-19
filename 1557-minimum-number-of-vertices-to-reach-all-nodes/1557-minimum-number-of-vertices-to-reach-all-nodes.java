class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> inDegreeCount = new HashMap<>();
        for(int i=0;i<n;i++) {
            inDegreeCount.put(i, 0);
        }
        for(int i=0;i<edges.size();i++) {
            inDegreeCount.put(edges.get(i).get(1), inDegreeCount.getOrDefault(edges.get(i).get(1), 0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(Integer itr: inDegreeCount.keySet()) {
            if(inDegreeCount.get(itr)==0) {
                result.add(itr);
            }
        }
        return result;
        
    }
}
   