import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class TestCollection{
public  static void main(String[] args) {
    //创建Collection
        Collection<String> collection = new ArrayList<>();
         //使用size方法
    System.out.println(collection.size());
          //使用isEmpty方法
    System.out.println(collection.isEmpty());
    //使用add插入元素
    collection.add("我");
    collection.add("爱");
    collection.add("java");
    System.out.println(collection.size());
    System.out.println(collection.isEmpty());
    //使用toArray把collection转换成数组
    Object[] array = collection.toArray();
    System.out.println(Arrays.toString(array));
    System.out.println();
    for (String s : collection ) {
        System.out.print(s + " ");
    }
    //使用contains方法判断元素是否存在
    System.out.println();
    System.out.println(collection.contains("我"));
    //使用remove删除元素
    collection.remove("我");
    System.out.println();
    System.out.println("删除后");
    for (String s:collection) {
        System.out.print(s + " ");
    }
    //使用clear清空所有元素
    collection.clear();
    System.out.println();
    System.out.println("清空后");
    System.out.println(collection.size());
    System.out.println(collection.isEmpty());
    }
}