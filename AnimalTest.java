

class Animal{
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying{
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class Cat extends Animal implements IRunning{
    public Cat(String name){
       super(name);
    }
    @Override
    public  void run(){
        System.out.println(this.name + "正在用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming{
    public Fish(String name){
        super(name);
    }
    @Override
    public void swim(){
        System.out.println(this.name + " 正在用尾巴游");
    }
}
class Frog extends  Animal implements ISwimming,IRunning{
    public Frog(String name){
        super(name);
    }
    @Override
    public void swim(){
        System.out.println(this.name + "正在蛙泳");
    }
    @Override
    public void run(){
        System.out.println(this.name + "正在往前跳");
    }
}
class Duck extends  Animal implements IRunning,ISwimming,IFlying{
    public Duck(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.name + "正在用俩条腿跑");
    }
    @Override
    public void swim(){
        System.out.println(this.name + "正在用鸭掌游 ");
    }
    @Override
    public void fly(){
        System.out.println(this.name + "正在用翅膀飞");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
       Cat cat = new Cat("小猫咪");
        cat.run();
       Fish fish = new Fish("小鱼儿");
       fish.swim();
       Frog frog = new Frog("小青蛙");
       frog.run();
       frog.swim();
       Duck duck = new Duck("小鸭子");
       duck.fly();
       duck.run();
       duck.swim();
    }
}
