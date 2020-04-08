public class MyQueueByLinkedList {
    static class Node{
        public int val = 0;
        public Node next = null;
        public Node(int val) {
            this.val = val;
        }
    }
    Node head  = null; //记录链表的头
    Node tail = null;//记录链表的尾
    //采用尾部入队列，头部出队列的方式
    public void offer(int val){   //入队列
        Node newNode = new Node(val);
        if(head == null){   //如果为空链表
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;  //不为空则进行尾插
        tail = tail.next;
    }
    public Integer poll(){  //出队列
        if(head == null){  //如果为空链表则返回空引用
            return null;
        }
        int ret = head.val;
        head = head.next;
        if(head == null){  //出队列后为空链表，则置tail为空
            tail = null;
        }
        return ret;
    }
    public Integer peek(){
       if(head == null){
           return null;
       }
       return head.val;
    }
}
