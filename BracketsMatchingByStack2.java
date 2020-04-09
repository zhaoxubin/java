import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsMatchingByStack {
    public static void main(String[] args) {
        String str = "((({[]})))";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        //先创建一个栈
        Stack<Character> stack = new Stack<>();
        //循环遍历每个字符
        for(int i = 0; i < str.length(); i++  ){
            char rec = str.charAt(i);
            //取出当前字符，如果为右括号就入栈
            if(rec == '(' || rec == '[' || rec == '{'){
                stack.push(rec);
                continue; //返回继续判断是否需要入栈
            }
            //判断rec为右括号即取出栈顶元素
            if(stack.empty()){
                //如果发现当前字符不是左括号,并且栈为空，说明当前字符违法
                //这种情况说明没有合适的左括号与当前括号匹配
                return false;
            }
            char top = stack.pop();
            //判断c是否为右括号，如果是就取出栈顶元素top与rec比较
           if(map.get(top) == rec ){
               continue;
           }
            return false;
        }
        return true;
    }
}