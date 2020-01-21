
import java.util.*;
public class CheckLogin {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scan.nextLine();
        System.out.println("请输入用户秘密");
        String mrsoft = scan.nextLine();
        if(!username.equals("zhaoxubin")){
            System.out.println("用户名输入不合法");
        } else if (!mrsoft.equals("123456")){
            System.out.println("用户密码输入不合法");
        } else {
            System.out.println("登录成功");
        }
    }
}
