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
        System.out.println("姓名："+name+"  年龄："+age+"   性别："+sex);
    }
    @Override
    public String toString(){
     return "person{"+"姓名："+name+" 年龄:"+age+"  性别："+sex+"}";
    }
}
public class Main11 {
    public static void main(String[] args) {
        TestDemo8 person = new TestDemo8("赵旭斌",12,"男");
        person.show();
        System.out.println(person);
    }
}