class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> ans = new ArrayList<>();
    HashMap<Integer,Integer>map1=new HashMap<>();
    for(int n:nums){
        map1.put(n,map1.getOrDefault(n,0)+1);
    } 
    for(Integer key:map1.keySet()){
        if(map1.get(key)==2){
            ans.add(key);
        }
    } 
    return ans;
    }
}