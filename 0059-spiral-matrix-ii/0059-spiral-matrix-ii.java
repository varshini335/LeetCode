class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr =new int[n][n];
        int start=0;
        int end=n-1;
        int p=1;
        while(start<=end){
       for(int i=start;i<=end;i++){
        arr[start][i]=p;
        p++;
       }
       for(int i=start+1;i<=end;i++){
        arr[i][end]=p;
        p++;
       }
       for(int i=end-1;i>=start;i--){
        arr[end][i]=p;
        p++;
       }
       for(int i=end-1;i>=start+1;i--){
        arr[i][start]=p;
        p++;
       }
       start++;
       end--;
        }
       return arr;
    }
}