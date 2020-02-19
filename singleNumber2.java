class Solution {
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        if(nums.length == 1){
            return nums[0];
        } else  if((nums[0]^nums[1] )!= 0 && (nums[1]^nums[2]) == 0){
            return nums[0];
        } else if((nums[nums.length-1]^nums[nums.length-2])!= 0){
            return nums[nums.length-1];
        }else if((nums[1]^nums[0])!= 0 && (nums[1]^nums[2])!= 0){
            return nums[1];
        } else {
        for(int i = 2; i < nums.length-1; i++){
            int temp = 0;
            for(int j = 1;j < i;j++){
              if((nums[i]^nums[j]) == 0){
                  temp ++;
              }
            }
            for(int j = i+1; j < nums.length;j++){
               if((nums[i]^nums[j]) == 0){
                   temp ++;
               }
            }
            if(temp == 0){
                num = nums[i];
                break;
            }
        }
        return num;
        }
    }
}