import static java.lang.System.arraycopy;
public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[array1.length];
        System.out.print("¿½±´Ç°");
        for (int x : array2) {
            System.out.print(x);
        }
        System.out.println("\n");
        System.arraycopy(array1,0,array2,0,array1.length);
        System.out.print("¿½±´ºó");
        for (int x : array2 ) {
            System.out.print(x);
        }
     }
}