public class TestDemo3 {
    private int age = 12;
    private String name = "�����";
    public void show(){
        System.out.println("����:"+name+"   ����:"+age);
    }
}
public class Main6 {
    public static void main(String[] args) {
        TestDemo3 test = new TestDemo3();
        test.show();
    }
}