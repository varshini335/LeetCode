class Solution { 
    public int[] frequencySort(int[] nums) { 
        ArrayList<Integer> a = new ArrayList<>(); 
        HashMap<Integer,Integer> map1 = new HashMap<>(); 
        for(int n : nums){ 
            map1.put(n, map1.getOrDefault(n,0)+1); 
        }  
        while(!map1.isEmpty()){ 
            int min = Integer.MAX_VALUE; 
            for(int key : map1.keySet()){ 
                int val = map1.get(key); 
                if(val < min){ 
                    min = val; 
                } 
            }
            int key1 = Integer.MIN_VALUE;
            for(int key : map1.keySet()){ 
                if(map1.get(key) == min && key > key1){ 
                    key1 = key;
                }
            }
            for(int i = 0; i < min; i++){ 
                a.add(key1); 
            }
            map1.remove(key1);
        } 
        int[] arr = new int[a.size()]; 
        for(int i = 0; i < arr.length; i++){ 
            arr[i] = a.get(i); 
        } 
        return arr; 
    } 
}