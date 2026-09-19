class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int[] arr = new int[2];
            int count = 0;
            int p = 0;
            for(int j = 2; j * j <= nums[i]; j++) {
                if(nums[i] % j == 0) {
                    int k = nums[i] / j;
                    if(j == k) {
                        count++;
                    }
                    else {
                        count += 2;
                        if(p < 2) {
                            arr[p] = j;
                            p++;
                        }
                        if(p < 2) {
                            arr[p] = k;
                            p++;
                        }
                    }
                }
            }
            if(count == 2) {
                sum = sum + arr[0] + arr[1] + 1 + nums[i];
            }
        }
        return sum;
    }
}