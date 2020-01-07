public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {23,1,12,34,27,109,45,36,87,18,24};
        bubbleSort(array);
        for (int x: array) {
            System.out.println(x);
        }
    }
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i <array.length-1; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }
        return array;
    }

}
