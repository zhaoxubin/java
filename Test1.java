class B {
    public B(){
       func();
    }
    public void func(){
        System.out.Println("B.func()" + num);
    }
}
class D extends B {
    private int  num = 1;
    @override
    public void func() {
        System.out.Println("D.func()" + num);
    }
}
public class Test {
    public static void main(String[] args){
        D d = new D;
    }
}