class Solution {
    public int missingNumber(int[] nums) {
        int temp = nums.length;
    for(int i = 0 ; i < nums.length ; i++){
       temp ^= nums[i];
       temp ^= i;
    }
    return temp;
    }
}