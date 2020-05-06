import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class pair implements Comparable<pair>{ //写一个类用来比较和保存一对数值
    public int n1;
    public int n2;
    public int sum;

    public pair(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.sum = n1 + n2;
    }

    @Override
    public int compareTo(pair o) {
        return this.sum - o.sum;
    }
}
public class HeapExam {
  public List<List<Integer>> kSmallesPairs(int[] nums1,int[] nums2,int k){
      List<List<Integer>> result = new ArrayList<>(); //先创建一个二维顺序表用来保存结果
      if(nums1.length == 0 || nums2.length == 0 || k <= 0){ //先排除特殊情况
          return result;
      }
      //此处应该建立一个小堆
      PriorityQueue<pair> queue = new PriorityQueue<>(); //实现一个优先队列（保存类对象）
      for(int i = 0; i < nums1.length ; i++){
          for (int j = 0; j < nums2.length; j++) {
              queue.offer(new pair(nums1[i],nums2[j])); //双重循环将类对象存入队列
          }
      }
      for(int x = 0; x < k ; x ++ ){
          pair cur = queue.poll(); //出队列，此时出队列的类对象，应是保存其中最小的一对值
          List<Integer> temp = new ArrayList<>();  //创建一个顺序表
          temp.add(cur.n1);  //将此时最小类对象的值存入顺序表
          temp.add(cur.n2);
          result.add(temp); //最后将结果放入总的二维顺序表中
      }
      return result; //返回结果
  }
}