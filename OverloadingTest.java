public class OverloadingTest{
      public void info(){
         System.out.println("普通方法");
    }
      public void info(int age){
         System.out.println("重载方法");
    }
    public static void main(String[] args){
        OverlodingTest ot = new OverlodingTest();
        ot.info();
        for(int i = 1;i < 5;i++){
        ot.info(i);
        }
    }
  }
