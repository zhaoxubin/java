class Solution {
    public boolean isPowerOfTwo(int n) {
     if(n <= 0){
         return  false;
     }
     if(n == 1 || n == 2) {
         return true;
     }
     if(n % 2 == 1) {
         return false;
     }
     while(n > 2) {
         n /= 2;
         if(n % 2 == 1){
             return false;
         }
     }
     return true;
    }
}