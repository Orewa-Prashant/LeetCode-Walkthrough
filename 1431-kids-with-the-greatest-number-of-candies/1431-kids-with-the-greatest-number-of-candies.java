class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(max<=candies[i]+extraCandies)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}