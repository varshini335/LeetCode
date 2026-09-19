class Solution {
    public int maximumCount(int[] nums) {
        int p=0,q=0;
       for(int n:nums){
        if(n<0){
            p++;
        }
        if(n>0){
            q++;
        }
       } 
       int max=Math.max(p,q);
       return max;
    }
}