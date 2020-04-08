public class MyQueueByArray {
    private int[] array = new int[100];
    //[head , tail)为有效元素，注意tail可能跑到head前面
    private int head = 0; //标记对首位置
    private int tail = 0; //标记队尾位置
    private int size = 0;//表示元素个数
    public void offer(int val){  //入队列
        if(size == array.length){  //如果队列满了直接返回
            return;
        }
        array[tail] = val;
        tail++;
        if(tail >= array.length){ //判断tail如果大于等于队列长度，就置tail为0
            tail = 0;
        }
        size++;
    }
    public Integer poll(){  //出队列
      if(size == 0){   //如果队列为空直接返回null
          return null;
      }
      int ret = array[head];
      head++;
      if(head >= array.length){    //判断head如果大于等于队列长度，就置head为0
          head = 0;
      }
      size--;
      return ret;

    }
    public Integer peek(){  //访问对首元素
        if(size == 0){
            return null;
        }
        return array[head];
    }
}