public class Person2 {
    public int age;
    public String name;         // ��Ա���� ʵ������
    public String sex;
    public void eat(){         //��Ա����
        System.out.println("�Է�");
    }
    public void sleep(){
        System.out.println("˯��");
    }
    public void show(){
        System.out.println("�ҽ�:"+name+"   "+"����:"+age+"   "+"�Ա�:"+sex);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Person2 person = new Person2();  //ͨ��newʵ��������
        person.age = 12;
        person.name = "�����";
        person.sex = "��";
        Person2 person2 = new Person2();
        person2.age = 13;
        person2.name = "�Ż���";
        person2.sex = "Ů";
        person.show();
        person2.show();
    }
}