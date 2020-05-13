import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Brokenkeyboard {
    public static void main(String[] args) {
        //1,循环读入两个字符串  第一个为预期输出  第二个为实际输出
        //2，把输入的两个字符串全都转为大写，方便比较和输出
        //3.先用set将实际输出的字符串存起来，再去循环用set查找预期输出的字符串中各字符是否存在set中
        //4，假设一个字符预期字符串出现了三次，实际输出中没有，则最终判断结果中存在三个这个字符
        //5.最终我们只需要得到仅有一个同样的字符的字符串，所以还要去重（用Set）
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){ //循环读取
            String expected = scanner.next();  //预期输出
            String actual = scanner.next();  //实际输出
            Set<Character> set = new HashSet<>(); //用来存放实际输出
            for (int i = 0; i < actual.length(); i++) {
               //此处设计重复元素问题，set中不能存在相同元素
                //如果存在，再次add就会失败，但是不会抛出异常
                //并且对此题没有任何影响
                set.add(actual.charAt(i));  //将实际输出存放到set中
            }
            Set<Character> find = new HashSet<>(); //用来辅助去重
            for (int i = 0; i < expected.length(); i++) {
                char c = expected.charAt(i);//取出expeced中的元素
                if(set.contains(c)){
                    continue; //存在说明这个键是好的
                }
                if(find.contains(c)){
                    continue; //是坏键但是输出过了 //此为去重核心,防止打印多次
                }
                System.out.print(c);
                find.add(c);
            }
        }
    }
}
