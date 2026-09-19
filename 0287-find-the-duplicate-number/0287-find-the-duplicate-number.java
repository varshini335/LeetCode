class Solution {
    public int findDuplicate(int[] nums) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
     } 
     for(int key:map.keySet()){
        int p=map.get(key);
        if(p>1){
            return key;
        }
     } 
     return 0; 
    }
}