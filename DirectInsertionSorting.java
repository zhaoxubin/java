
import java.util.Random;
public class DirectInsertionSorting{
public static void main(String[] args){
    Random random = new Random();
    int[] array = new int [20];
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(90);
    }
    directInsertionSorting(array);
    printArray(array);
}
public static void directInsertionSorting(int[] arr){
    int temp ;
    int k;
    for (int i = 0; i < arr.length; i++) {
        temp = arr[i];
        for ( k = i-1; k >= 0 && arr[k] > temp; k--) {
            arr[k+1] = arr[k];
        }
        arr[k+1] = temp;
    }  
}
public static void printArray(int[] arr2){
    for ( int i = 0; i < arr2.length; i++) {
        System.out.print(arr2[i]+"  ");
    }
}
} 