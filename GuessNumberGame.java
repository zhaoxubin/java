import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("###### ��ӭ������������Ϸ #########");
        System.out.println("##################################");
        System.out.println("####  1��PLAY       0��EXIT  ####");
        System.out.println("##################################");
        Scanner scanner=new Scanner(System.in);
        boolean quit=true;
        while(quit){
            int select=scanner.nextInt();
            switch(select){
               case 1:
                play();
                break;
                case 0:
                quit=false;
                break;
                default:
                    System.out.println("���������������������");
            }
        }
        System.out.println("Good Bye");
    }
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        while (true) {
            System.out.println("��������Ĳ²����֣�����1����100��");
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("��´���");
            } else if (guess < randomNumber) {
                System.out.println("���С��");
            } else {
                System.out.println("��¶���");
              break;
            }
        }
    }
}