public class SimpleOperation{
     public static void main(String[] args){
      char a=10;
      short b=20;
       a=(char)b;             /*�س���������char short ����ǿת*/
       b=(short)a;
       System.out.println("a="+2+"  "+"b="+b);  
       System.out.println("11.5%2.0="+11.5%2.0);        /*���������༴ȡģ����*/
       try{                                                                    /*��������ϰ*/
             System.out.println(1/0);
                       }catch(ArithmeticException e){
                                  System.out.println("����");  
                                  }
         }
}