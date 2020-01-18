class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
        if(x % 10 == 0){
            return false;
        }
        
        int num = 0;
        while(x > 0){
            num = num*10 + x%10;
            x /= 10;
        }
        if(temp == num){
            return true;
        }  else {
        return false;
        }
    }
}