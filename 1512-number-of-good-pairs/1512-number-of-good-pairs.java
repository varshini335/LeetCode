class Solution {
    public int numIdenticalPairs(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
       } 
       int sum=0;
       for(int key:map.keySet()){
        int val=map.get(key);
        if(val>1){
            int k=(val*(val-1))/2;
        
        sum+=k;
        }
       }
       return sum;
    }
}