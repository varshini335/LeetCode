class Solution {
    public int pivotIndex(int[] nums) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }
     int ls=0;
     for(int i=0;i<nums.length;i++){
        if(ls==sum-ls-nums[i]){
            return i;
        }
        else{
            ls+=nums[i];
        }
     } 
     return -1;

    }
}