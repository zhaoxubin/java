import java.util.Scanner;
public class FrogJumpStamp {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("������̨�׵ĸ���");
      int n = scan.nextInt();
      int result =  jumpStmp(n);
        System.out.println(n+"��̨�׵�������"+result+"��");
    }
    public static int jumpStmp(int n){
        if( n == 1 || n ==2){
            return n;
        } else {
            return jumpStmp(n-1) + jumpStmp(n-2);
        }
    }

}
