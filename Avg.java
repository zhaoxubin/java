import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        System.out.println("请输入你要求的平均数数字的个数");
        int[] array = new int[new Scanner(System.in).nextInt()];
        intPut(array);
       int result = avg(array);
        System.out.println("平均数是"+result);
    }
    public static void intPut(int array[]){
        System.out.println("请输入你的数据");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static int avg(int[] array ){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        int avg = sum/array.length;
        return avg;
    }
}