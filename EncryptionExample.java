import java.util.Scanner;
public class EncryptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ��Ӣ���ַ���������ַ���");
        String password = scan.nextLine();
        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (char)(arr[i]^20000);
        }
        System.out.println("���ܻ���ܽ�����£�");
        System.out.println(new String(arr));
    }
}
