class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int j=0;
        int sum=0;
        for(int i:neededTime)sum+=i;
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;){
            char ch=colors.charAt(i);
            j=i+1;
            // pq.add(neededTime[i]);
            int max=neededTime[i];
            while(j<n && colors.charAt(j)==ch){
                //if(j==i+1)pq.add(neededTime[i]);
                // pq.add(neededTime[j]);
                max=Math.max(max,neededTime[j++]);
            }
            // if(!pq.isEmpty())sum-=pq.poll();
            // pq.clear();
            sum-=max;
            i=j;
        }
        return sum;
    }
}