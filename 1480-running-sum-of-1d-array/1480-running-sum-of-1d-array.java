class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int [nums.length];
        int c=0;
        int n=nums.length;
        for(int i =0;i<n;i++){
            c+=nums[i];
          //  sum[i]=0;
            sum[i]=c;
        }
        return sum;
    }
}