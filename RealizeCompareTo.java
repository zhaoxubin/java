public class RealizeCompareTo {
    public static void main(String[] args) {
       int result =  compareTo("a","A"); //调用compareTo方法
        System.out.println(result);
    }
    public static int compareTo(String str1,String str2){
        int result1 = 0;
       int result2 = 0;
        for(int i = 0; i < str1.length(); i++){
            result1 += str1.charAt(i);  //累加字符的ASCII值
        }
        for(int i = 0; i < str2.length(); i++){
            result2 += str2.charAt(i);
        }
        if(result1 > result2){
            return result1 - result2;
        }
        return result2 - result1;
    }
}