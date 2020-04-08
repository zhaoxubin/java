public class MyStack {
    private int[] array = new int[100];
    private int size = 0;
    public void push(int data){ //入栈操作
        array[size] = data;
        size++;
    }
    public int peek(){  //取栈顶元素
        return array[size - 1];
    }
    public int pop(){  //出栈操作
        int ret  =  array[size -1];
        size--;
        return ret;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
    }
}