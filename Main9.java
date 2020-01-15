public class TestDemo6 {
    private String name;
    private int age;
    private String sex;
    public TestDemo6(){
        this("吕布",18,"男");//用this这样调用，必须放在第一行
    }
    //这两个构造函数之间的关系为重载
    public TestDemo6(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("姓名：" +name+"  年龄："+age+"  性别："+sex);
    }
}
public class Main9 {
    public static void main(String[] args) {
        TestDemo6 test = new TestDemo6();
        test.show();
    }
}