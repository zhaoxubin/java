public class TestDemo9 {
    private String name;
    private int age;
    public TestDemo9(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("������"+name+"  ���䣺"+age);
    }
}
public class Main12 {
    public static void main(String[] args) {
        new TestDemo9("�����",12).show();
    }
}
