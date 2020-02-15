import java.util.Arrays;
public class ArrayCopy4{
    public static void main(String[]  args) {
        int[] array = {1,2,3,4,5};
        int[] newArr = Arrays.copyOfRanger(array,2,4);
        System.out.print("拷贝后：");
        for (int x : newArr) {
            System.out.print(x+" ");
        }
    }
}
