class Solution {
    ArrayList<Integer> al= new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        fun(0,n,k,"");
        int[] arr= new int[al.size()];
        int j=0;
        for(int i:al)
            arr[j++]=i;
        return arr;
    }
    void fun(int id,int n,int k,String asf){
        if(id==n){
           al.add(Integer.parseInt(asf));
            return;
        }
        for(int j=0;j<=9;j++){
            if(id==0){
                if(j==0)continue;
                fun(id+1,n,k,asf+j);
                continue;
            }
            char ch=asf.charAt(id-1);
            int d=ch-'0';
            if(j==d+k||j==d-k)
            fun(id+1,n,k,asf+j);
        }
    }
}