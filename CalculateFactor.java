import java.util.Scanner;
public class CalculateFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ������");
        int number = scanner.nextInt();
       int result= fac(number);
        System.out.println(number+"�Ľ׳�Ϊ"+result);
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
