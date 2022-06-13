class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //if(triangle.size()==1)return triangle.get(0).get(0);
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=triangle.get(i).size()-1;j>=0;j--){
                if(i==triangle.size()-1)continue;
                else{
                    int val=triangle.get(i).get(j)
                        +Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                    triangle.get(i).set(j,val);
                }
            }
        }
        return triangle.get(0).get(0);
    }
}