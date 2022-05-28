class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int rcost=0;
        if(homePos[0]>startPos[0])
            for(int i=startPos[0]+1;i<=homePos[0];i++)
                rcost+=rowCosts[i];
        else
            for(int i=startPos[0]-1;i>=homePos[0];i--)
                rcost+=rowCosts[i];
        
        int ccost=0;
        if(homePos[1]>startPos[1])
            for(int i=startPos[1]+1;i<=homePos[1];i++)
                ccost+=colCosts[i];
        else{
            for(int i=startPos[1]-1;i>=homePos[1];i--)
                ccost+=colCosts[i];
        }
        return rcost+ccost;
    }
    
}