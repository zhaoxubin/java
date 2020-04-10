import java.util.Stack;

public class MinStack {
    Stack<Integer> A = new Stack<>();  //用来保存所有元素
    Stack<Integer> B = new Stack<>();  //用来保存当前A栈内的所有元素的最小值
    public void push( int val){    //入栈（AB同时入栈）
        A.push(val);   //当前元素入栈A
        if(B.isEmpty()){  //如果B为空就将当前值作为此时A栈中的最小值
            B.push(val);  
            return;
        }
       int min = B.peek();  //不为空就取出栈顶元素
        if(val < min){   //如果新元素小于栈顶元素，就将新元素入栈B
            min = val;
        }
        B.push(min);  //否则依旧是取出的栈顶元素再次入栈（确保了同等元素数目的AB）
    }
    public Integer pop(){  //出栈
        if(A.isEmpty()){  //如果A为空，就返回null
            return null;
        }
        B.pop();  //B出栈，保持了Ab内元素数目一致，且B始终保存的是当前A中的最小值
        return A.pop();  //返回出栈Ad的元素
    }
    public Integer peek(){  //取栈顶元素
        if(A.isEmpty()){   
            return null;
        }
        return A.peek();
    }
    public Integer GetMin(){  //取最小值
        if(B.isEmpty()){  //如果B为空，说明A也为空，即无最小值返回null
            return null;
        }
        return B.peek(); //否则直接返回B的栈顶元素即可
    }
}