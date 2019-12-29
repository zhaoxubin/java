import java.util.Scanner;
public class CalculateFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
       int result= fac(number);
        System.out.println(number+"的阶乘为"+result);
    }
    public static int fac(int number){
        int i=1;
        int result=1;
        for(;i<=number;i++) {
            result *= i;
        }
       return result;
    }
}
