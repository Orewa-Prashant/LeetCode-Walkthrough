class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        int min=Integer.MAX_VALUE,max=0;
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                count+=mat[i][j];
            }
            min=Math.min(min,count);
            max=Math.max(max,count);
            if(!h.containsKey(count))
            h.put(count,new ArrayList<Integer>());
            h.get(count).add(i);
        }
        int[] ans=new int[k];
        int j=0;
        for(int i=min;j<k;i++){
            if(!h.containsKey(i))continue;
            for(int p=0;p<h.get(i).size();p++){
                if(j==k)break;
                ans[j++]=h.get(i).get(p);
            }
            if(j==k)break;
            
        }
        return ans;
    }
}