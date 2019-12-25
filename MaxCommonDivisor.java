import java.util.Scanner;
public class MaxCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int mcd=maxcom(num1, num2);
        System.out.println(mcd);
    }

    public static int maxcom(int num1, int num2) {
        int small = num1 < num2 ? num1 : num2;
        int i = 1;
        for (i = small; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {

                break;
            }
        }
        return i;
    }
}


