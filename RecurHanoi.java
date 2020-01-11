import java.util.Scanner;
public class RecurHanoi{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入圆盘的个数");
        int n = scan.nextInt();
        hanoi(n,'A','B','C');
    }
    public static void hanoi(int n,char A,char B,char C){
        if(n == 1){
            move(A,C);
        } else {
           hanoi(n-1,A,C,B);
           move(A,C);
           hanoi(n-1,B,A,C);
        }
    }
    public static void move(char a,char b){
        System.out.println("move "+a+"->"+b);
    }
}
