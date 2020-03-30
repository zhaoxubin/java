import java.util.Scanner;
public class ChangeEmptyBottles {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int num = 0;
      while(scan.hasNext()){
          num = scan.nextInt();
          bottle(num);
      }
      scan.close();
   }
   private static void bottle(int num) {
          int sodas = 0;
          while(num >= 3){
            int temp = num/3;
            sodas += temp;
            num = num%3 + temp;
           }
          if(num + 1 == 3){
           sodas++;
          }
        System.out.println(sodas);
  }
}