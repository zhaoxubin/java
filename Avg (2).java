import java.util.Scanner;
public class Avg(2) {
    public static void main(String[] args) {
        System.out.println("请输入数据");
        Scanner scan = new Scanner(System.in);
        int num = 0;
        double sum = 0;
        while (scan.hasNextDouble()){
            double tmp = scan.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("数字总和为："+sum);
        System.out.println("平均数为" + sum/num);
        scan.close();
    }

}
