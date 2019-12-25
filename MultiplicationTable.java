import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想打印的乘法表数");
        int num=scanner.nextInt();
        mult(num);
    }
    public static void mult(int num){
        int i=1;
        for(;i<=num;i++){
            int j=1;
            for(j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"  ");
            }
            System.out.print("\n");
        }
    }
}
