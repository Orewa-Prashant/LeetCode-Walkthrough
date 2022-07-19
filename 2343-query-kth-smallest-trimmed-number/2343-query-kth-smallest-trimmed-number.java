class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
         int[] ans =  new int[queries.length];
        int indx=0;
        for(int[] q : queries){
            HashMap<Integer,String> hm = new HashMap<Integer,String>();
            int trim = q[1];
            int length=nums[0].length();
            for(int i=0;i<nums.length; i++){
                String temp  = nums[i].substring(length-trim);
                hm.put(i,temp);
            }
            
            List<Map.Entry<Integer, String> > list =
               new LinkedList<Map.Entry<Integer, String> >(hm.entrySet());
 
         
            Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1,
                               Map.Entry<Integer, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
            
          ans[indx]=list.get(q[0]-1).getKey();
            indx++;
        }
        return ans;
    }
}