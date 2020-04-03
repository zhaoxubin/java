import java.util.*;
public class GetMaxDigitStr {
    private static boolean isDigit(char ch){   //写一个判断是不是0--9的数字的方法
        return ch >= '0' && ch <= '9';
    }
    private static String getMaxDigitStr(String str){
        int count = 0;  //用来记录连续数字的个数
        int max = 0;    //用来保存当前最长的数字串的个数
        int endIndex = 0; //用来记录最长数字串最后一个对应字符的下标
        for (int i = 0; i < str.length(); i++){  //循环遍历字符串
            if(isDigit(str.charAt(i))){
                count++;   //如果某个元素为数字count++
                if(max < count){  
                    max = count;  //如果此时max小于此时count，则更新max的值
                    endIndex = i; //保存此时最长数字串最后一个对应字符的下标
                }
            }
            else{
                count = 0; //如果遇到不是字符数字就将count置为0，重新统计
            }
        }
        return str.substring(endIndex - max + 1,endIndex + 1);//返回最长数字串
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str = scan.next();
        System.out.println(getMaxDigitStr(str));
    }
}