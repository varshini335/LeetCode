
class Solution {
    public int findNumbers(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int k=nums[i];
            while(k!=0){
                k=k/10;
                count++;
            }
         if(count%2==0){
                x++;
            }
        }
        return x;
}
}