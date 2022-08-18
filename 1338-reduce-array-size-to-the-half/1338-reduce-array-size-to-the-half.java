class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:map.values())
            pq.offer(val);
        
        
        int limit=(int)Math.ceil((float)arr.length/2);
        int ans=0;
        while(limit>0){
            limit-=pq.poll();
            ans++;
        }
        return ans;
    }
}