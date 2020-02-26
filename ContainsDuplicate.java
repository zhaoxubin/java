方法1：
class Solution {
    public boolean containsDuplicate(int[] nums) {
    for(int i = 0;i < nums.length;i++) {
      for(int j = 0; j < nums.length; j++ ) {
          if(((nums[i]^nums[j])== 0) && (i != j)){
            return true;
          }
      }
    }
    return false;
    }
}


方法2；
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i = 0;i < nums.length-1;i++) {
      
          if(nums[i] == nums[i+1]){
            return true;
          }
    }
    return false;
    }
}




