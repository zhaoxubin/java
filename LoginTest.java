class UserError extends Exception{
    public UserError(String message) { //定义一个用户名错误的类继承Exception，继承自Exception为受查异常
        super(message);  //实现构造方法
    }
}
class PasswordError extends Exception{ //定义一个密码错误的类继承Exception
    public PasswordError(String message) {
        super(message);  //实现构造方法
    }
}
public abstract class LoginTest {
    public static String userName = "admain"; //设置用户名
    public static String password = "1234";  //设置密码

    public static void main(String[] args) throws UserError, PasswordError {  //抛出异常信息，此处抛出为异常代码的调用栈信息
        logain("admain","1234"); //用用户名密码登录
    }

    private static void logain(String userName, String password)throws UserError,PasswordError { //抛出自定义异常信息
        if(!LoginTest.userName.equals(userName)){
            throw new UserError("用户名错误"); //抛出
        }
        if(!LoginTest.password.equals(password)){
            throw new PasswordError("密码错误"); //抛出
        }
        System.out.println("登陆成功");
    }
}