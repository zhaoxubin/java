class Solution {
    public String convertToTitle(int n) {
        String s = "";
        int k  = n;
        while(n > 26){
            k = n  % 26;
            n = n / 26;
            if(k==0){//没有表示0的字母，故若余数为0，需置为26， 商退一位
                k = 26;
                n = n - 1;
            } 
            char c = (char)('A' + k-1 );
            s = c+s;
        }
        char c = (char)('A' +  n -1);
        s = c+s;
        return s;
    }
}