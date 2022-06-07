class Solution {
    public int mctFromLeafValues(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int v:arr)
            ans.add(v);
        int min=Integer.MAX_VALUE;
        int res=0;
        int id=-1;
        while(ans.size()>1){
            min=Integer.MAX_VALUE;
            id=-1;
            for(int i=0;i<ans.size()-1;i++){
                if(min>ans.get(i)*ans.get(i+1)){
                    min=ans.get(i)*ans.get(i+1);
                    id=i;
                }
            }
            if(ans.get(id)<=ans.get(id+1))
                ans.remove(id);
            else ans.remove(id+1);
            res+=min;
        }
        return res;
    }
}