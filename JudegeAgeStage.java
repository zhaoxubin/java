import java.util.Scanner;
public class JudegeAgeStage {
    public static void main(String[ ] Args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age=scanner.nextInt();
        if(age<=18){
            System.out.println("少年");
        } else if (age>=19&&age<=28) {
            System.out.println("青年");
        } else if (age>=29&&age<=55) {
            System.out.println("中年");
        } else if (age>=56) {
            System.out.println("老年");
        }
    }
}