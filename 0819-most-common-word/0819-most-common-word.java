class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll("[^a-z ]", " ");
        String[] words=paragraph.split("\\s+");
        HashMap<String,Integer>map1=new HashMap<>();
        for(String k:words) {
            if(!k.equals("")){
                map1.put(k,map1.getOrDefault(k, 0)+1);
            }
        }
        int max=0;
        String k="";
        for(String key:map1.keySet()) {
            boolean ban=false;
            for(String b:banned){
                if(key.equals(b)){
                    ban=true;
                    break;
                }
            }
            if(!ban){
                int val=map1.get(key);
                if (val>max) {
                    max=val;
                    k=key;
                }
            }
        }
        return k;
    }
}