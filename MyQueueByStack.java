import java.util.Stack;

public class MyQueueByStack {
    //先创建两个栈
    private Stack<Integer> A = new Stack<>();  //用来入队列
    private Stack<Integer> B = new Stack<>();  //用来出队列
    public void push(int val){  //入队列
        // 如果栈B不为空，先将B中的元素倒腾到栈A
        while(!B.isEmpty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        //接着入栈只需将元素放入栈A
        A.push(val);
    }
    public Integer pop(){  //出队列
        if(empty()){
            return null; //如果队列为空（即AB栈都为空）直接返回null
        }
        while(!A.isEmpty()){  //当A栈不为空，将A中的元素倒腾到B
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.pop(); //直接返回B的出栈元素，即为出队列的元素
    }
    public Integer peek(){  //取队首元素
        if(empty()){
            return null; //如果队列为空（即AB栈都为空）直接返回null
        }
        while(!A.isEmpty()){  //当A栈不为空，将A中的元素倒腾到B
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek(); //直接返回B的栈顶元素，即为出队列的栈顶元素
    }
    public boolean empty(){
        return A.isEmpty() && B.isEmpty();  //如果AB栈都为空则表示队列为空
    }

    public static void main(String[] args) {
        MyQueueByStack queue = new MyQueueByStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}