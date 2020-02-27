class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        int count = 0;
        for(int i  = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
              if((nums[i] == nums[j])&&(j != i)&&((j-i) <= k)) {
                   count++;
              }
            }
        }
        if(count > 0){
            return true;
        } else {
            return false;
        }
        
    }
}



