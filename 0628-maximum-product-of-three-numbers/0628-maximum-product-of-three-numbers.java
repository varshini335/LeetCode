class Solution {
    public int maximumProduct(int[] nums) {
        int max=1;
        int n = nums.length;
      Arrays.sort(nums);
      int op = nums[n-1]*nums[n-2]*nums[n-3];
      int ko = nums[0]*nums[1]*nums[n-1];
      return Math.max(op,ko);
    }
}