public class Animal{
    protected  String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(String food){
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}
public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void eat(String food){
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }
}
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("圆圆");
        animal1.eat("谷子");
        Animal animal2 = new Animal("扁扁");
        animal1.eat("玉米");
    }
}