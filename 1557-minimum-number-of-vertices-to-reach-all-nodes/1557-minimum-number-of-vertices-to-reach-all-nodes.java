class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        int[] inDegreeCount = new int[n];
        
        for(int i=0;i<edges.size();i++) {
            inDegreeCount[edges.get(i).get(1)]++;
        }
        List<Integer> result = new ArrayList<>();
        int index = 0;
        for(Integer itr: inDegreeCount) {
            
            if(itr==0) {
                result.add(index);
            }
            index++;
        }
        return result;
        
    }
}
   