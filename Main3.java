public class Person3 {
    public int age;
    public String name;
}
public class Main3 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        System.out.println(person.name.length());
        //Exception in thread "main" java.lang.NullPointerException
        //���׳���ָ���쳣����Ϊ�˴�nameû�г�ʼ������nameΪnull
    }
}
