
import java.util.*;

public class CountSteps{
    
    public static int countSteps(int n){
        int f1 = 0;
        int f2 = 1;
        int f3 = f1 + f2;
        while(true){
            if(n == f1 || n == f2){
                return 0;
            }else
            if(f2 > n){
                if(Math.abs(f1 - n) > Math.abs(f2 - n)){
                    return Math.abs(f2 - n);
                }
                else{
                    return Math.abs(f1 - n);
                }
            }
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = countSteps(n);
        System.out.println(ret);
    }
}
