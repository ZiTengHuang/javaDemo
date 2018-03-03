package listdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author:MyHzt
 * @ClassName:
 * @Date:Created in 22:17 2017/11/22 0022
 */
public class HashMapTest {

    public static void main(String[] args) {
        mapTest();
        mapEntry();
    }

    private static void mapTest() {
        Map map = new HashMap();
        map.put("1", "牛逼腾");
        map.put("2", "牛逼黄");
        map.put("3", "牛逼紫");
        map.put("4", "牛逼啊");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Object me = iterator.next();
            System.out.println(map.get(me));
        }
    }

    private static void mapEntry(){
        Map map = new HashMap();
        map.put( 1, "牛逼腾");
        map.put("2", "牛逼黄");
        map.put("3", "牛逼紫");
        map.put("4", "牛逼啊");
        map.put("5",new studen("腾大屌",19));
        if (map.keySet() instanceof studen){
            System.out.println(map.get("5"));
        }
        System.out.println(map.get("5"));

    }
}

 class studen{
     String name;
     int age;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public studen(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public studen() {
     }

     @Override
     public String toString() {
         return getName()+getAge();
     }
 }
