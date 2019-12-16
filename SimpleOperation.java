public class SimpleOperation{
     public static void main(String[] args){
      char a=10;
      short b=20;
       a=(char)b;             /*特出变量类型char short 互相强转*/
       b=(short)a;
       System.out.println("a="+2+"  "+"b="+b);  
       System.out.println("11.5%2.0="+11.5%2.0);        /*浮点数求余即取模操作*/
       try{                                                                    /*报错处理练习*/
             System.out.println(1/0);
                       }catch(ArithmeticException e){
                                  System.out.println("出错");  
                                  }
         }
}