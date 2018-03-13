package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:MyHzt
 * @ClassName:   删除Arraylist中重复的元素
 * @Date:Created in 22:17 2017/11/22 0022
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new person("黄三", 1));
        list.add(new person("黄四", 2));
        list.add(new person("黄三", 1));
        list.add(new person("黄四", 2));
        list.add(new person("黄三", 1));
        ArrayList newlist = clearRepetitionList(list);
        ArrayList list1 = new ArrayList();
        list1.add("a");
        list1.add("a");
        list1.add("a");
        list1.add("b");
        list1.add("b");
        System.out.println(clearRepetition(list1));
        newlist.remove(new person("黄三",1));
        System.out.println(newlist);
    }

    //清除list集合中重复的对象
    //1：定义接受的集合
    //2：遍历老集合
    //3: 判断是否拥有（进入contains源码 看到他的Equels是比地址值）重写 remove也是这样
    private static ArrayList clearRepetitionList(ArrayList list) {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object nextValue = iterator.next();
            if (!arrayList.contains(nextValue)) {
                arrayList.add(nextValue);
            }
        }
        return arrayList;
    }

    private static ArrayList clearRepetition(ArrayList list) {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

}
