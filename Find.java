public class Solution{
    public boolean Find(int[][] array,int target){
        for(int row = 0; row < array.length; row++){
            int low = 0;
            int high = array.length-1;
            while(low <= high){
                int mid = (low + high)/2;
                if(array[mid] < target){
                    high = mid -1;
                } else if( array[mid] > target ){
                    low = mid + 1;
            } else {
                return true;
            }
        } 

        }
        return false;
    }
}