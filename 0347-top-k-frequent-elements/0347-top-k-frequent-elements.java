class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer>map1=new HashMap<>();
      for(int n:nums){
      map1.put(n,map1.getOrDefault(n,0)+1);
      }
    ArrayList<Integer>ans=new ArrayList<>();
      for(Integer key:map1.keySet()){
       ans.add((key));
      } 
      ans.sort((a, b) -> map1.get(b) - map1.get(a));
      int[] arr = new int[k];
      for(int i=0;i<k;i++){
        arr[i]=ans.get(i);
      } 
      return arr;
    }
}