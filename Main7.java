public class TestDemo4 {
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println("姓名："+this.name+"   年龄："+this.age);
    }
}
public class Main7 {
    public static void main(String[] args) {
        TestDemo4 test = new TestDemo4();
        test.setAge(12);
        int  age = test.getAge();
        test.setName("赵旭斌");
        String name = test.getName();
        System.out.println("姓名："+name+"   年龄："+age);
        test.show();
    }
}