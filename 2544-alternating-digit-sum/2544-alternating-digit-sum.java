class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int count=0;
       while(n>0){
        count++;
        if(count%2!=0){
           sum+=(n%10);
        }
        if(count%2==0){
            sum-=(n%10);
        }
        n=n/10;
       }
       return count%2==0?-sum:sum;
    }
}