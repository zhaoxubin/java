public class PracticeOverload {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int result1=add(a,b);
        System.out.println(result1);
        double num1=10;
        double num2=20;
        double num3=30;
        double result2=add(num1,num2,num3);
        System.out.println(result2);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double num1,double num2,double num3){
        return num1+num2+num3;
    }
}
