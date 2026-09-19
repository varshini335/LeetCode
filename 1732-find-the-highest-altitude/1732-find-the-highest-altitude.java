class Solution {
    public int largestAltitude(int[] gain) {
      int[] sum = new int [gain.length+1];
        int c=0;
        int n=gain.length;
        for(int i =0;i<n;i++){
            c+=gain[i];
            sum[i]=c;
        }
         int max=sum[0];
         for(int j=0;j<sum.length;j++){
             if(sum[j]>max){
                max=sum[j];
            }
         } 
        return max; 
    }
}