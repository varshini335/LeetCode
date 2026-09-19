class Solution {
    public int thirdMax(int[] nums) {
     Arrays.sort(nums);
     int n=nums.length;
     int i,k=1;
     for(i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
     } 
     if(k>=3){
        return nums[k-3];
     } 
     else{
        return nums[k-1];
     } 
    }
}