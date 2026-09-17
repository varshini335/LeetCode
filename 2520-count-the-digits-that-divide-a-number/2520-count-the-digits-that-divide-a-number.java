class Solution {
    public int countDigits(int num) {
        int count=0,k;
        int n=num;
       while(num!=0){
        k=num%10;
        if(n%k==0){
            count++;
        }
       num=num/10;
       } 
       return count;
    }
}