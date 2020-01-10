import java.util.Scanner;

public class FibRecur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你想打印的斐波那契额数的项数");
        int num = scan.nextInt();
        int result = fib(num);
        System.out.println(result);
    }
    public static int fib(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fib(num-2)+fib(num-1);
    }
}
