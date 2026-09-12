class Solution {
    public int countDigits(int num) {
        int count=0;
        int nums=num;
     while(nums>0){
        int k=nums%10;
        if(k!=0 && num%k==0){
            count++;
        }
        nums=nums/10;
     }
     return count;   
    }
}