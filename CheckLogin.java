
import java.util.*;
public class CheckLogin {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("�������û���");
        String username = scan.nextLine();
        System.out.println("�������û�����");
        String mrsoft = scan.nextLine();
        if(!username.equals("zhaoxubin")){
            System.out.println("�û������벻�Ϸ�");
        } else if (!mrsoft.equals("123456")){
            System.out.println("�û��������벻�Ϸ�");
        } else {
            System.out.println("��¼�ɹ�");
        }
    }
}
