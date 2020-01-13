public class Person3 {
    public int age;
    public String name;
}
public class Main3 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        System.out.println(person.name.length());
        //Exception in thread "main" java.lang.NullPointerException
        //会抛出空指针异常，因为此处name没有初始化，即name为null
    }
}
