public class TestDemo8 {
    private String name;
    private int age;
    private String sex;
    public TestDemo8(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("������"+name+"  ���䣺"+age+"   �Ա�"+sex);
    }
    @Override
    public String toString(){
     return "person{"+"������"+name+" ����:"+age+"  �Ա�"+sex+"}";
    }
}
public class Main11 {
    public static void main(String[] args) {
        TestDemo8 person = new TestDemo8("�����",12,"��");
        person.show();
        System.out.println(person);
    }
}