class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l= new ArrayList<>();
        int k=1;
        for(int i=0;i<target.length;i++,k++){
            if(target[i]==k)l.add("Push");
            else{
                l.add("Push");
                l.add("Pop");
                i--;
            }
        }
        return l;
    }
}