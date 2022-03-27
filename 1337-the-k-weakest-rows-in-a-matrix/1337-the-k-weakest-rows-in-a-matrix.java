class Pair implements Comparable<Pair>  {
    int count;
    int i;
    Pair (int count,int i) {
        this.count = count;
        this.i = i;
    }
    public int compareTo (Pair p) {
        if (count == p.count)
            return this.i - p.i;
        return this.count - p.count;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ar = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0;i < n;i++) {
            int j;
            for (j = 0;j < m;j++) {
                if (mat[i][j] == 0)
                    break;
            }
            int k1 = (j == 0) ? 0 : j + 1;
            pq.add (new Pair(k1,i));
        }
        int i = 0;
        while (k-- > 0) 
            ar[i++] = pq.poll().i;
        return ar;
    }
}