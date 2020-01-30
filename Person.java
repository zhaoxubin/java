public class Person{
      private String name;
      private String gender;
      private int age;
      public Person(){
           System.out.println("使用无参构造方法创建对象");
       }
      public Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("使用有参构造方法创建对象");
       }
      public String getName(){
      return name;
    }
      public String getGender(){
      return gender;
    }
      public int getAge(){
      return Age;
    }
   }
 public class Test{
        public static void main(String[] args){
        Person  person2 = new Person("比特科技"，"男"，18);
        System.out.println("员工1的信息");
        System.out.println("员工姓名:  "+person1.getName());
        System.out.println("员工性别:  "+person1.getGender());
        System.out.println("员工年龄:  "+person1.getAge());
        System.out.println("员工2的信息");
        System.out.println("员工姓名:  "+person2.getName());
        System.out.println("员工性别:  "+person2.getGender());
        System.out.println("员工年龄:  "+person2.getAge());
      }
   }
    
  
