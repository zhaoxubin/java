class Solution {
    public void moveZeroes(int[] nums) {
       for(int i = 0 ; i < nums.length; i++){
           for(int j = i; j < nums.length;j++)
           if(nums[i] == 0 && nums[j] != 0){
               int temp = nums[j];
               nums[j] = nums[i];
               nums[i] = temp;
           }
       }
    }
}