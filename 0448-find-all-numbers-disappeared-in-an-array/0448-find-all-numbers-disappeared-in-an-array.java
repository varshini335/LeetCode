class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> ans = new ArrayList<>();
      Arrays.sort(nums);
      int i;
      Set<Integer> v = new HashSet<>();
        for (int k : nums) {
           v.add(k);
        }
        for(i=1;i<=nums.length;i++){
            if(!v.contains(i)){
                ans.add(i);
            }
        }
      return ans;  
    }
}