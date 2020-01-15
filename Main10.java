public class TestDemo7 {
    private String name;
    private int age;
    private String sex;
    //构造函数
    public TestDemo7(){
        System.out.println("执行构造函数");
    }
    //实例代码块也叫构造代码块
    {
        this.name = "赵旭斌";
        this.age = 13;
        this.sex = "男";
        System.out.println("执行实例代码块");
    }
    static{
        System.out.println("执行静态代码块");
    }
    public void show(){
        System.out.println("姓名："+name+"  年龄："+age+"   性别："+sex);
    }
}
public class Main10 {
    public static void main(String[] args){
      TestDemo7 test =  new TestDemo7();
      test.show();
    }
}