public class TestDemo2 {
    public int count;
    public static int sum;
    public static void Print() {
        // System.out.println(count);  ��̬����������ʹ�÷Ǿ�̬��Ա���Ի���÷Ǿ�̬����
        System.out.println(sum);
    }
}

public class Main5 {
    public static void main(String[] args) {
        TestDemo2.Print();
        TestDemo2.sum = 10; //��̬��Ա��������ֱ�ӣ�����.������
        TestDemo2 test = new TestDemo2();//�Ǿ�̬��Ա������Ҫ��������
        test.count = 20;
    }
}