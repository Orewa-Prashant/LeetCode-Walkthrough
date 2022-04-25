class Solution {
    public int totalFruit(int[] fruits) {
        int i=0,j=0;
        int len=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(;i<fruits.length;i++){
            h.put(fruits[i],h.getOrDefault(fruits[i],0)+1);
            //System.out.println(h);
            while(h.size()>2){
                h.put(fruits[j],h.get(fruits[j])-1);
                if(h.get(fruits[j])==0)h.remove(fruits[j]);
                j++;
            }
            len=Math.max(len,i-j+1);
        }
        return len;
    }
}