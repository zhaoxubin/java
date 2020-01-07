import java.util.Arrays;
public class ArraySortFunc {
    public static void main(String[] args) {
        int[] array = {23,1,12,34,27,109,45,36,87,18,24};
        Arrays.sort(array);
        for (int x: array) {
            System.out.println(x);            
        }
    }
}