public class TestDemo {
    public static int sum ;
    public int count;
}
public class Main4 {
    public static void main(String[] args) {
        TestDemo test1 = new TestDemo();
        test1.count++;
        TestDemo.sum++;
        System.out.println("=========================");
        TestDemo test2 = new TestDemo();
        test2.count++;
        TestDemo.sum++;
        System.out.println(test2.count);
        System.out.println(TestDemo.sum);
    }
}