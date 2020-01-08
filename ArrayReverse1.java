public class ArrayReverse1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        reverse(array);
        for (int x : array ) {
            System.out.println(x+" ");
        }
    }
    public static int[] reverse(int[] array){
        int n = array.length-1;
        for (int i = 0; i <array.length/2 ; i++) {
           int temp = array[i];
           array[i]=array[n];
           array[n]=temp;
                n--;
            }
            return array;
        }
    }