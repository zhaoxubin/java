import java.util.Scanner;
public class Avg(2) {
    public static void main(String[] args) {
        System.out.println("����������");
        Scanner scan = new Scanner(System.in);
        int num = 0;
        double sum = 0;
        while (scan.hasNextDouble()){
            double tmp = scan.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("�����ܺ�Ϊ��"+sum);
        System.out.println("ƽ����Ϊ" + sum/num);
        scan.close();
    }

}
