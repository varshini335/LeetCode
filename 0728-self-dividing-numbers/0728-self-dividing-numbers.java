class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> ans = new ArrayList<>();
        int i;
        for(i=left;i<=right;i++){
            int temp=i;
            int count=0;
        int add=0;
      while(temp!=0){
        int r = temp%10;
        add++;
        if(r!=0 && i%r==0){
          count++;
        }
        temp=temp/10;
      }
      if(count==add){
        ans.add(i);
      }
    }
      return ans;
    }
}