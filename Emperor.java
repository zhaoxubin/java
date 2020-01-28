public class Emperor{
     private static Emperor emperor = null;
     private Emperor(){
    }
    public static Emperor getInstance(){
    if(emperor = null){
       emperor = new Emperor();
    }
    return emperor;
    }
    public void getName(){
        System.out.println("乾隆皇帝");
    }
}
public class Test{
    public static void main(String[] args){
    System.out.println("创建皇帝1对象;  ");
    Emperor emperor1 = Emperor.getInstance();
    emperor1.getName();
    System.out.println("创建皇帝2对象;  ");
    Emperor emperor2 = Emperor.getInstance();
    emperor2.getName();
    }
}
