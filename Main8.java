public class TestDemo5 {
    private int age;
    private String name;
    private String sex;
    public  TestDemo5(){
        this.age = 18;
        this.name = "�ŷ�";
        this.sex = "��";
    }
    public  TestDemo5(String name,int age,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void show(){
        System.out.println("������" +name+"  ���䣺"+age+"  �Ա�"+sex);
    }
}
public class Main8 {
    public static void main(String[] args){
        TestDemo5 test = new TestDemo5() ;
        test.show();
        TestDemo5 test2 = new TestDemo5("����",12,"��");
        test2.show();
    }
}