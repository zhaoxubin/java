public class TestDemo7 {
    private String name;
    private int age;
    private String sex;
    //���캯��
    public TestDemo7(){
        System.out.println("ִ�й��캯��");
    }
    //ʵ�������Ҳ�й�������
    {
        this.name = "�����";
        this.age = 13;
        this.sex = "��";
        System.out.println("ִ��ʵ�������");
    }
    static{
        System.out.println("ִ�о�̬�����");
    }
    public void show(){
        System.out.println("������"+name+"  ���䣺"+age+"   �Ա�"+sex);
    }
}
public class Main10 {
    public static void main(String[] args){
      TestDemo7 test =  new TestDemo7();
      test.show();
    }
}