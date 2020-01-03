import java.util.Scanner;
public class RedFuc {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        print(new Scanner(System.in).nextInt( ));
    }
    public static void print(int num){
        System.out.println("你的输入是");
        System.out.println(num);
    }
}