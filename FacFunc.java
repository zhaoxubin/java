import java.util.Scanner;

public class FacFunc {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        int result =fac(num);
        System.out.println(num +"的阶乘为："+result);
    }
    public static int fac(int num){
        if(num == 1||num == 0){
            return 1;
        }
        return num*fac(num-1);
    }
}
