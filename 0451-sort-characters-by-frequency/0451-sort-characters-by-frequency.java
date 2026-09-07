class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
      } 
     String e="";
      while(!map.isEmpty()){
        int max=0;
        char d=' ';
      for(char p :map.keySet()){
        int key=map.get(p);
        if(key>max){
            max=key;
            d=p;
        }
      } 
      for (int i = 0; i < max; i++) {
                e += d;
            }
      map.remove(d);
      }
      return e;
    }
}