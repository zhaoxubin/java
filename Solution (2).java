class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                   num[0] = i;
                   num[1] = j;
                }
            }
        }
        return num;
    }
}