class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        fun(0,n,ans);
        return ans;
    }
    void fun(int num, int n, List<Integer> ans){
        if(num>n)return;
        if(num>0)
        ans.add(num);
        num*=10;
        for(int i=0;i<10;i++){
            if(num==0 && i==0)continue;
            fun(num+i,n,ans);
        }
        num/=10;
    }
}