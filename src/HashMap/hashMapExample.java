package HashMap;

import java.util.*;

/**
 * @Author: HuangZiTeng
 * @Date: 15:27 2018/4/2 0002
 * @ClassUse:
 * @Modified: no
 */
public class hashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);
        map.put("牛七", 27);
//        basicExample(map);
        //    MapIteratorExample()
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for (Map.Entry<String, Integer> map1 : entries) {
//            System.out.println(map1.getKey());
//            System.out.println(map1.getValue());
//        }
        for (String key : map.keySet()) {
            System.out.println(key + "="+map.get(key));
        }
    }

    private static void MapIteratorExample(Map<String, Integer> map) {
        //使用迭代器 迭代他的key 获取他Value
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }

    private static void basicExample(Map<String, Integer> map) {
        Integer i5 = map.put("李四", 25);
        System.out.println(map);
        //此时输出是无序的  因为是继承的set
        System.out.println(i5);
        // 键相同时，值覆盖，并返回覆盖的值
        System.out.println(map.containsKey("李四"));
        System.out.println(map.containsValue(24));
        Collection<Integer> c = map.values();
        System.out.println(c);
        //獲取MAP的值
    }

}
