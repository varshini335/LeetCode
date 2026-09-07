class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 
       HashMap<Integer,String>p=new HashMap<>();
       for(char z:map.keySet()){
        int key =map.get(z);
        p.put(key,p.getOrDefault(key,"")+z);
       }
       String q = "";
        int max = 0;
        int maxFreq = 0;

        for(int key : p.keySet()) {

            String z = p.get(key);

            if(z.length() > max ||
               (z.length() == max && key > maxFreq)) {

                max = z.length();
                maxFreq = key;
                q = z;
               }
        }
        return q;
    }
}