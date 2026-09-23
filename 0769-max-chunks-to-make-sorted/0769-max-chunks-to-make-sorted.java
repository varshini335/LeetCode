class Solution {
    public int maxChunksToSorted(int[] arr) {
       int p=0,count=0;
       for(int i=0;i<arr.length;i++){
        p=Math.max(p,arr[i]);
       if(p==i){
        count++;
       }
       }
       return count;
       
    }
}