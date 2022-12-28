class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int i: piles){
            pq.add(i);
            sum+=i;
        }
        
        while(pq.size()>0 && k-->0){
            int top = pq.poll();
            int currTop = (int)Math.ceil((float)top/2);
            sum-=top-currTop;
            pq.add(currTop);
        }
        return sum;
    }
}