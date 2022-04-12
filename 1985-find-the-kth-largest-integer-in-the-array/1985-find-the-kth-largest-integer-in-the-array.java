class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq=new PriorityQueue<>((a,b) -> {
            if(a.length()==b.length())
                return a.compareTo(b);
            return Integer.compare(a.length(),b.length());
        });
        for (String num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll(); // pop the minimum value in the heap
            }
        }
        return pq.peek();
    }
}

