class Solution {
    public void nextPermutation(int[] c) {
        int i,j=-1;
        for(i=c.length-1;i>0;i--){
            if(c[i]>c[i-1]){
                j=i-1;
                break;
            }
        }
        if(j==-1){
            for(i=0,j=c.length-1;i<j;i++,j--){
                int temp=c[j];
                c[j]=c[i];
                c[i]=temp;
            }
            
        return;
        }
        int min=110,k=0;
        for(i=j+1;i<c.length;i++){
            if(c[i]>c[j]&&min>c[i]){
                min=c[i];
                k=i;
            }
        }
        int temp=c[k];
        c[k]=c[j];
        c[j]=temp;
        Arrays.sort(c,j+1,c.length);
    }
}