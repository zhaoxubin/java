import java.util.LinkedList;
        import java.util.Queue;

public class MyStackByQueue {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();
    public void push(int val){  //入栈时将数据放入队列A
        A.offer(val);
    }
    public Integer pop(){   //出栈
        if(isEmpty()){   //如果队列为空即返回null
            return null;
        }
        while(A.size() > 1){   //当队列A的元素个数大于一，就将元素挨个出队列A放入队列
            Integer temp = A.poll();
            B.offer(temp);
        }
        //当循环结束时，栈队列A就剩一个元素
        int rec = A.poll();  //保存这个元素，并出队列
        swap(); //交换AB队列，便于下次操作（无论是入栈出栈取栈顶元素都保证了是A中元素往B中倒腾）
        return rec; //返回出栈元素，
    }

    public void swap() {  //交换AB队列
        Queue<Integer> temp = A;
        A = B;
        B = temp;
    }

    public Integer peek(){   //取栈顶元素
        if(isEmpty()){   //如果队列为空即返回null
            return null;
        }
        while(A.size() > 1){   //当队列A的元素个数大于一，就将元素挨个出队列A放入队列
            Integer temp = A.poll();
            B.offer(temp);
        }
        //当循环结束时，栈队列A就剩一个元素
        int rec = A.poll();  //保存这个元素，并出队列
        B.offer(rec); //将这个元素再放入队列B(保持栈的元素完整)
        swap(); //交换AB队列，便于下次操作（无论是入栈出栈取栈顶元素都保证了是A中元素往B中倒腾）
        return rec; //返回出栈元素，
    }
    public boolean isEmpty(){  //判断栈是否为空
        return A.isEmpty() ;  //只要判断A队列是否为空
    }

    public static void main(String[] args) {
        MyStackByQueue queue = new MyStackByQueue();
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