
class Solution {
    public int singleNumber(int[] nums) {
        int temp = 0;
        Arrays.sort(nums);
        if(nums.length == 1){
            temp = nums[0];
        } 
        else{
        if(nums[0] != nums[1]) {
            temp = nums[0];
        } else if(nums[nums.length - 1] != nums[nums.length - 2]) {
            temp = nums[nums.length - 1];
        } else {
        for(int i = 1; i < nums.length - 1;i++) {
            if((nums[i] != nums[i-1]) && (nums[i] != nums[i+1])) {
                 temp = nums[i];
            }
        }
        
        }
        }
        return temp;
    }     
}