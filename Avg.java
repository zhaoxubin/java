import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        System.out.println("��������Ҫ���ƽ�������ֵĸ���");
        int[] array = new int[new Scanner(System.in).nextInt()];
        intPut(array);
       int result = avg(array);
        System.out.println("ƽ������"+result);
    }
    public static void intPut(int array[]){
        System.out.println("�������������");
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