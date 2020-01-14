public class TestDemo3 {
    private int age = 12;
    private String name = "ÕÔĞñ±ó";
    public void show(){
        System.out.println("ĞÕÃû:"+name+"   ÄêÁä:"+age);
    }
}
public class Main6 {
    public static void main(String[] args) {
        TestDemo3 test = new TestDemo3();
        test.show();
    }
}