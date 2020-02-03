public class Cat3{
    private String name;
    private int age;
    private double weight;
    private Color color;
    public Cat(String name,int age,double weight,Color color){
         this.name = name;
         this.age = age;
         this.weight = weight;
         this.color = color;
    }
    @Override
    public String toString(){
         StringBuilder sb = new StringBuilder();
         sb.append("名字:  "+ name + "\n");
         sb.append("年龄:  "+ age + "\n");
         sb.append("重量:  "+ weight + "\n");
         sb.append("颜色:  "+ color + "\n");
         return sb.toString();
     }
  }
 public class Test{
        public static void main(String[] args){
        Cat cat1 = new Cat("java",12,21,Color.BLACK);
        Cat cat2 = new Cat("c++",12,21,Color.WHITE);
        Cat cat3 = new Cat("java",12,21,Color.BLACK);
        System.out.println("猫咪1号的哈希码" + cat1);
        System.out.println("猫咪2号哈希码" + cat2);
        System.out.println("猫咪3号哈希码" + cat3);
     }
   }
    
  
