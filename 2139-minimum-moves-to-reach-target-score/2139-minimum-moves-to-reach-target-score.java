class Solution {
    public int minMoves(int num, int maxDoubles) {
        int steps=0;
        while(num!=1){
            if(maxDoubles==0){
                return steps+num-1;
            }
            else{
                if(num%2==0){
                    num/=2;
                    maxDoubles--;
                }
                else num--;
            }
            steps++;
        }
        return steps;
    }
}