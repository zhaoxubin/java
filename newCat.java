public class Cat2{
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
    public boolean equals(Object obj){
         if(this == obj){
             return true;
        }
        if(obj == null){
             return false;
        }
        if(getClass() != obj.getClass){
             return false;
        }
        Cat cat = (Cat)obj;
        return name.equals(cat.name)&&(age == cat.age)
                &&(weight == cat.weight)&&(color.equals(cat.color));
      }
    @Overrid
    public int hashCode(){
     return 7*name.hashCode()+11*new Integer(age).hashCode()+13
            *new Double(weight).hashCode()+17*color.hashCode();
    }
  }
 public class Test{
        public static void main(String[] args){
        Cat cat1 = new Cat("java",12,21,Color.BLACK);
        Cat cat2 = new Cat("c++",12,21,Color.WHITE);
        Cat cat3 = new Cat("java",12,21,Color.BLACK);
        System.out.println("猫咪1号的哈希码" + cat1.hashCode());
        System.out.println("猫咪2号哈希码" + cat2.hashCode());
        System.out.println("猫咪3号哈希码" + cat3.hashCode());
        System.out.println("猫咪1号是否与猫咪2号相同" + cat1.equals(cat2));
        System.out.println("猫咪1号是否与猫咪3号相同" + cat1.equals(cat3));
     }
   }
    
  
