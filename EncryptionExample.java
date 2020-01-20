import java.util.Scanner;
public class EncryptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = scan.nextLine();
        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (char)(arr[i]^20000);
        }
        System.out.println("加密或解密结果如下：");
        System.out.println(new String(arr));
    }
}
