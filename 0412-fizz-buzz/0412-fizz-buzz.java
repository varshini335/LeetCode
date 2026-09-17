class Solution {
    public List<String> fizzBuzz(int n) {
       ArrayList<String> Stringarray= new ArrayList<>();
      int i;
    
      for(i=1;i<=n;i++){
       if(i%3==0 && i%5==0){
        Stringarray.add("FizzBuzz");
       }
       else if(i%3==0){
        Stringarray.add("Fizz");
       }
       else if(i%5==0){
        Stringarray.add("Buzz");
       }
       else{
        Stringarray.add(String.valueOf(i));
       }
      }
      return Stringarray;
    }
}