class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];

        int pro = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                pro *= nums[i];
            }
        }
        if (zeroCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = 0;
            }
        }
        else if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    arr[i] = pro;
                } else {
                    arr[i] = 0;
                }
            }
        }

        else {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = pro / nums[i];
            }
        }

        return arr;
    }
}