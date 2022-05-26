import java.util.Scanner;

public class slide {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int time=sc.nextInt();
            int[][] v=new int[n][2];
            for(int i=0;i<n;i++){
                v[i][0]=sc.nextInt();
                v[i][1]=sc.nextInt();
            }
            System.out.println(fun(v,time));
        }
    }
            public static long timePeriod(int[] v) {
                int i=0,j=0;
                int ct=0;
                int prev=-1;
                for(;i<v.length;i++){
                    if(v[i]>prev){
                        prev=v[i];

                    }
                    else{
                        j=i;
                    }
                    ct+=i-j+1;
                }
                //System.out.println(ct);
                return ct;
            }
    public static int fun(int[][] dishes, int t){
        if(t<=0){
            //System.out.println(start);
            System.out.println("Base case");
            return 0;
        }
        int ans=0;
        int val;
        for(int i=0;i<dishes[0].length;i++){
            if(dishes[i][0]<0)continue;
            val=dishes[i][0];
            dishes[i][0]=-1;
            ans=Math.max(ans,dishes[i][1]+fun(dishes,t-val));
            dishes[i][0]=val;
        }
        //System.out.println(start+" "+t+" "+ans);
        return ans;
    }
}
/*1
1
3 60
30 10
30 20
30 30  */
