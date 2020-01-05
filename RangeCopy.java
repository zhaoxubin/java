import java.util.Arrays;
public class RangeCopy {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = Arrays.copyOfRange(array1,2,4);
        for(int x : array2){
            System.out.println(x);
        }
    }
}