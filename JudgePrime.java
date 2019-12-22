import java.util.Scanner;
import static java.lang.StrictMath.sqrt;
public class JudgePrime {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();
        double  i=0;
        int count=0;
        for(i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(number+"是素数");
        }else{
            System.out.println(number+"不是素数");
        }
    }

}
