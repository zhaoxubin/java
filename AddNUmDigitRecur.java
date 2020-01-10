import java.util.Scanner;

public class AddNUmDigitRecur {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个多位整数");
        int num = sca.nextInt();
        int result = addNumDigit(num);
        System.out.println(result);
    }
    public static int addNumDigit(int num){
        if(num <10){
            return num;
        }
        return num%10+addNumDigit(num/10);
    }
}