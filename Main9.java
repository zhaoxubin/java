public class TestDemo6 {
    private String name;
    private int age;
    private String sex;
    public TestDemo6(){
        this("����",18,"��");//��this�������ã�������ڵ�һ��
    }
    //���������캯��֮��Ĺ�ϵΪ����
    public TestDemo6(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("������" +name+"  ���䣺"+age+"  �Ա�"+sex);
    }
}
public class Main9 {
    public static void main(String[] args) {
        TestDemo6 test = new TestDemo6();
        test.show();
    }
}