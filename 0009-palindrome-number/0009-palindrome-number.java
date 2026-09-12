class Solution {
    public boolean isPalindrome(int x) {
      Scanner sc = new Scanner(System.in);
      int rev=0;
      int ori=x; 
      while(x>0){
        rev=rev*10+(x%10);
        x=x/10;
      }
      if(ori==rev){
        return true;
      } 
      else{
        return false;
      }
    }
}