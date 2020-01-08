public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        reverse(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
    public static int[ ] reverse(int[] array){

        int left = 0;
        int right = array.length-1;
        while(left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
       return array;
    }

}