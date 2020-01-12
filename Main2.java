public class Person2 {
    public int age;
    public String name;         // 成员属性 实例变量
    public String sex;
    public void eat(){         //成员方法
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println("我叫:"+name+"   "+"年龄:"+age+"   "+"性别:"+sex);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Person2 person = new Person2();  //通过new实例化对象
        person.age = 12;
        person.name = "赵旭斌";
        person.sex = "男";
        Person2 person2 = new Person2();
        person2.age = 13;
        person2.name = "张慧玉";
        person2.sex = "女";
        person.show();
        person2.show();
    }
}