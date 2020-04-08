import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int ret = stack.pop();
        System.out.println(ret);
         ret = stack.pop();
        System.out.println(ret);
         ret = stack.pop();
        System.out.println(ret);
         ret = stack.pop();
        System.out.println(ret);
//        ret = stack.peek(); //在java的标准库中的Stack中，如果栈为空则去pop与peek操作都会抛出异常
//        ret = stack.pop()
    }
}