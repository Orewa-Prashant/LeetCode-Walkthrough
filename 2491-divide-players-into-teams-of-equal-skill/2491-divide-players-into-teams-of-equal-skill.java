class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long tot=0;
        int sum = skill[0]+skill[skill.length-1];
        tot=skill[0]*skill[skill.length-1];
        for(int i=1,j=skill.length-2;i<j;i++,j--){
            int currSum=skill[i]+skill[j];
            if(currSum != sum)return -1;
            tot+=skill[i]*skill[j];
        }
        return tot;
    }
}