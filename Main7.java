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
        System.out.println("������"+this.name+"   ���䣺"+this.age);
    }
}
public class Main7 {
    public static void main(String[] args) {
        TestDemo4 test = new TestDemo4();
        test.setAge(12);
        int  age = test.getAge();
        test.setName("�����");
        String name = test.getName();
        System.out.println("������"+name+"   ���䣺"+age);
        test.show();
    }
}