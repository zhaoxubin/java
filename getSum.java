class Solution {
    public int getSum(int a, int b) {
         if(b == 0){
              return a;
         }
         int step = a & b;
         step <<= 1;
         return getSum(a ^ b,step);
    }
}