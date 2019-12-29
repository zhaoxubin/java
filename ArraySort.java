public class ArraySort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
       sort(array);
       int i=0;
       for(;i<array.length;i++){
           System.out.println(array[i]);
       }
    }
    public static int[] sort(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left<right){
            if(array[left]%2 != 0){
                left++;
            } else {
                if(array[right]%2 != 0){
                    int temp=array[left];
                    array[left]=array[right];
                    array[right]=temp;
                } else {
                    right--;
                }
            }
        }
        return array;
    }
}