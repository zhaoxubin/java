import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //创建Map实例
        Map<String,String> map = new HashMap<>();
        //使用size获取键值对个数
        System.out.println(map.size());
        //使用isEmpty查看是否为空
        System.out.println(map.isEmpty());
        //使用put方法把一些键值对存放进去
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        //使用get方法根据key查找对应的val
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("大刀"));//如果key不存在返回null
        System.out.println(map.getOrDefault("行者","武松"));//如果没有就返回defaultVal
        //通过containsKey和containsValue来判断某个值是否存在
        System.out.println(map.containsKey("及时雨"));//推荐使用，因为效率高
        System.out.println(map.containsValue("宋江"));
        //再次使用isEmpty和size
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        //使用foreach遍历map中所有键值对
        //Map中的元素顺数和插入顺序无关
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
       /通过key删除某个元素
        map.remove("及时雨");
        //清空map
        map.clear();
    }
}