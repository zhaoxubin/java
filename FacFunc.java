import java.util.Scanner;

public class FacFunc {
    public static void main(String[] args) {
        System.out.println("������һ��������");
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        int result =fac(num);
        System.out.println(num +"�Ľ׳�Ϊ��"+result);
    }
    public static int fac(int num){
        if(num == 1||num == 0){
            return 1;
        }
        return num*fac(num-1);
    }
}
