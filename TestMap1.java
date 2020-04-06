import java.util.HashMap;
import java.util.Map;
public class TestMap1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //如果插入的key存在，就会覆盖原来的value
        map.put("及时雨","晁盖");
        System.out.println(map);
    }
}