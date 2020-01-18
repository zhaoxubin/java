class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr1 = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();
        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                i++;
                j++;
            } else {
                if( arr2[j] > arr1[i]){
                    return false;
                }
                j++;
            }
        } 
        if(i == arr1.length){
            return true;
        }  else {
            return false;
        }
    }
}