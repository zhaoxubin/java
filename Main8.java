public class TestDemo5 {
    private int age;
    private String name;
    private String sex;
    public  TestDemo5(){
        this.age = 18;
        this.name = "张飞";
        this.sex = "男";
    }
    public  TestDemo5(String name,int age,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void show(){
        System.out.println("姓名：" +name+"  年龄："+age+"  性别："+sex);
    }
}
public class Main8 {
    public static void main(String[] args){
        TestDemo5 test = new TestDemo5() ;
        test.show();
        TestDemo5 test2 = new TestDemo5("刘备",12,"男");
        test2.show();
    }
}