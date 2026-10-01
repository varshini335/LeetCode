class Solution {
    public boolean isPowerOfThree(int n) {
       int i;
       for(i=0;i<100;i++){
        if(Math.pow(3,i)==n){
            return true;
        }
    }
    return false;
    }
}