class Solution {
    public int searchInsert(int[] nums, int target) {
         if(nums == null || nums.length == 0 ){
               return 0;
           }
       int temp = 0;
       for(int i = 0;i < nums.length;i++){
          
           if(nums[i] == target){
               return i;
           }
           if(nums[i] > target ){
              temp = i;
              break;
           }
           if(i == nums.length-1 && nums[nums.length-1] < target){
               temp=i+1;
           }
       }
       return temp;
    }
}