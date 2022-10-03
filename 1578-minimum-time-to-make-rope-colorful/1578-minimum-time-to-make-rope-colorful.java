class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int j=0;
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;){
            char ch=colors.charAt(i);
            j=i+1;
            while(j<n && colors.charAt(j)==ch){
                if(j==i+1)pq.add(neededTime[i]);
                pq.add(neededTime[j]);
                j++;
            }
            while(pq.size()>1){
                sum+=pq.poll();
            }
            if(!pq.isEmpty())pq.poll();
            i=j;
        }
        return sum;
    }
}