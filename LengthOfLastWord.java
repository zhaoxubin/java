class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int j = 0; 
        for(int i = arr.length-1;i >= 0;i--){
           if(arr[i] != 32){
               j++;
           } else if(j != 0){
               return j;
           }
        }
        return j;
    }
}