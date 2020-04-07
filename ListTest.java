import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //创建List实例
        List<String> list = new ArrayList<>();
        //新增元素
        list.add("我");
        list.add("爱");
        list.add("中");
        list.add("国");
        //打印整个list
        System.out.println(list);
        //根据下标访问元素
        System.out.println(list.get(1));
        //根据下标修改元素
        list.set(1,"她");
        //使用foreach访问list中的元素
        for (String s : list ) {
            System.out.println(s);
        }
        //使用for访问list中的元素
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //使用subList获取子序列
        System.out.println(list.subList(0,1));
        //可以使用构造方法构造出新的list对象
        List<String> list2 = new ArrayList<>(list);
        System.out.println("复制了一份list");
        System.out.println(list2);
    }
}