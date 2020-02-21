class Solution {
    public int titleToNumber(String s) {
    int ans = 0;
    int len = s.length();
    for(int i = 0; i < len ; i++) {
        ans = ans * 26 + (s.charAt(i) - 'A' +1);
    }
    return ans;
    }
}
