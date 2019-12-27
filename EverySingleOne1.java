import java.util.Scanner;
public class EverySingleOne1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        output(num);
    }
    public static void output(int num) {
        if (num > 9) {
            output(num/10);
        }
        System.out.println(num % 10);
    }
}