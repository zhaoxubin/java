import java.util.Scanner;
public class RequestMaxDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        max(number1,number2);
        int result=max(number1,number2,number3);
        System.out.println("最大的数为"+result);
    }
    public static int max(int number1,int number2){

       return number1>number2? number1:number2;

    }
    public static int max (int number1,int number2,int number3){
        return (max(number1,number2))>number3? max(number1,number2):number3;

    }
}