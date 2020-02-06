import java.util.Scanner;
public class Main {
	public static int reverse(int x) {
        int a=0;
        long b=0;
        while(x!=0){
            a=x%10;
            b=b*10+a;
            x=x/10;
        }
        if(b>Integer.MAX_VALUE||b<Integer.MIN_VALUE){
            return 0;
        }
        return (int)b;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		int ret=reverse(n);
			System.out.println(ret);	
	}
}
