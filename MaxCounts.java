import java.util.Scanner;
import java.util.Arrays;
public class MaxCounts{
    public static int countArr(int[] arr){
        int count =0;
        int len = arr.length/2;
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == arr[len]){
                count++;
            }
        }
        if(count > len){
            return arr[len];
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0;i < length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(countArr(arr));
    }
}