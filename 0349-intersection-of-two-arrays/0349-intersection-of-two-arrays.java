class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        for(int n1:nums1){
            map1.put(n1,map1.getOrDefault(n1,0)+1);
        }
         for(int n2:nums2){
            map2.put(n2,map2.getOrDefault(n2,0)+1);
        }
        List<Integer> intersectionList = new ArrayList<>();

        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                intersectionList.add(key);  
            }
        }
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }

        return result;
    }
}