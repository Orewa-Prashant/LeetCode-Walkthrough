class Solution {
    public int maximumRobots(int[] ct, int[] rc, long b) {
        int n=ct.length;
        int max=0;
        long sum=0; 
        int len=0;
        int res=0;
        long con=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0,j=0;i<n;i++){
            sum+=rc[i];
            pq.add(ct[i]);
            int seek=pq.peek();
            len=i-j+1;
            con=seek+(len*sum);
            //System.out.println(con+" "+len+" "+sum+" "+seek);
            while(pq.size()>0 && b<con){
                pq.remove(ct[j]);
                sum-=rc[j];
                j++;
                len--;
                if(pq.size()==0)break;
                seek=pq.peek();
                con=seek+(len*sum);
            }
            //System.out.println(i+" "+j+" "+seek+" "+sum+" "+pq.peek()+(i-j+1)*sum);
            res=Math.max(res,len);
        }
        return res;
    }
}