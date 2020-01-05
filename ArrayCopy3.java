import java.util.Arrays;
public class ArrayCopy3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 =  Arrays.copyOf(array1,array1.length);
        System.out.print("¿½±´ºó£º");
        for (int x : array2) {
            System.out.print(x+" ");
        }
    }
}