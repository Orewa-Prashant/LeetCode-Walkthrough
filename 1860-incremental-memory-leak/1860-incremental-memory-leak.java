class Solution {
    public int[] memLeak(int memory1, int memory2) {
        // First find crash time.
        // long l=0,r=memory1+memory2,total=memory1+memory2;
        // long n=0;
        // while(l<=r){
        //     long m=l+(r-l)/2;
        //     long tot = m*(m+1)/2;
        //     System.out.println(tot);
        //     if(tot<=total){
        //         n=Math.max(n,m);
        //         l=m+1;
        //     }
        //     else r=m-1;
        // }
        // int crashTime = (int)n;
        // System.out.println(n);
        int time=1;
        while(time<=memory1 || time<=memory2){
            if(memory1>=memory2)memory1-=time++;
            else memory2-=time++;
        }
        return new int[]{time, memory1, memory2};
    }
}