package HashSet;

import listdemo.person;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author: HuangZiTeng
 * @Date: 10:13 2018/3/27 0027
 * @ClassUse: set集合  无索引  不重复  无序
 * @Modified: no
 */
public class ExampleHashSet {

    public static void main(String[] args) {
        ExampleHashSet hashSet = new ExampleHashSet();
        hashSet.test3();

    }

    /**
     * LinkedHashSet
     * 底层是链表实现的，是set集合中唯一一个能保证怎么存就怎么取的集合对象
     * 因为是HashSet的子类，所以也是保证的唯一性
     */
    private void linkedHashSet() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        System.out.println(linkedHashSet);
    }

    /**
     * 可以迭代
     */
    private static void MathSet() {
        HashSet<person> hs = new HashSet<>();
        hs.add(new person("张三", 23));
        hs.add(new person("张三", 23));
        hs.add(new person("张三", 23));
        hs.add(new person("张三", 23));
        //此时hashset 的size还是4个元素因为 他们是不同的地址值 需要重写hashCode
        System.out.println(hs.size());
    }

    private void demo1() {
        HashSet<String> hashSet = new HashSet<>();
        boolean a = hashSet.add("a");
        boolean a1 = hashSet.add("a");
        for (String string : hashSet) {
            System.out.println(string);
        }
    }

    /**
     * 利用hash Set 保存1-20 不同的随机数 10个
     * 因为hash 有唯一的特性  我们只需要判断是否满足10个就OK
     * Random 的 构造函数 20 就是0-19 包头不含尾 +1 便会多一个
     */
    private void test1() {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 10) {
            hashSet.add(random.nextInt(20) + 1);
        }
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
    }

    /**
     * 读取一行字符 ，去掉其中重复的字符，打印出不同的字符
     */
    private void test2() {
        String str = "sfsadfsadfsadfqwerqldjnvwer";
        char[] chars = str.toCharArray(); //转换成字符数组
        HashSet<Character> arr = new HashSet<>();
        for (char c : chars) {
            arr.add(c);
        }
        for (Character character : arr) {
            System.out.println(character);
        }
    }

    private void test3() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aa");
        arrayList.add("aa");
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("bb");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.add("cc");
        arrayList.add("cc");
        getSingle(arrayList);
        System.out.println(arrayList);
    }

    /**
     * 去除List集合中的重复元素
     * 将LinkedHashSet集合
     *
     * @param arrayList
     */
    private void getSingle(List<String> arrayList) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        for (String string : arrayList) {
            linkedHashSet.add(string);
        }
        arrayList.clear();
        for (String string : linkedHashSet) {
            arrayList.add(string);
        }

    }
}
