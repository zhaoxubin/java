import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("###### 欢迎来到猜数字游戏 #########");
        System.out.println("##################################");
        System.out.println("####  1：PLAY       0：EXIT  ####");
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
                    System.out.println("你的输入有误，请重新输入");
            }
        }
        System.out.println("Good Bye");
    }
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入你的猜测数字（整数1——100）");
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("你猜大了");
            } else if (guess < randomNumber) {
                System.out.println("你猜小了");
            } else {
                System.out.println("你猜对了");
              break;
            }
        }
    }
}