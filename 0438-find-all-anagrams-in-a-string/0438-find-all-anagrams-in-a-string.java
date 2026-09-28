class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      ArrayList<Integer>ans=new ArrayList<>();
      char[] b = p.toCharArray();
      Arrays.sort(b);
      for(int i=0;i<=s.length()-p.length();i++){
      String k = s.substring(i, i + p.length());
      char[] a = k.toCharArray();
      Arrays.sort(a);
      if(Arrays.equals(a,b)){
         ans.add(i);
      }
      }
      return ans;
    }
}