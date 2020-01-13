public class TestDemo2 {
    public int count;
    public static int sum;
    public static void Print() {
        // System.out.println(count);  静态方法不可以使用非静态成员属性或调用非静态方法
        System.out.println(sum);
    }
}

public class Main5 {
    public static void main(String[] args) {
        TestDemo2.Print();
        TestDemo2.sum = 10; //静态成员变量方法直接（类名.）即可
        TestDemo2 test = new TestDemo2();//非静态成员变量需要依赖对象
        test.count = 20;
    }
}