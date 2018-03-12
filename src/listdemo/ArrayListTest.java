package listdemo;

import java.util.*;

/**
 * @Author:MyHzt
 * @ClassName: 集合框架
 * @Date:Created in 22:17 2017/11/22 0022
 */

public class ArrayListTest {
    private static List list = new ArrayList();

    public static void main(String[] args) {
//        studentMap();
//        CollectionMath();
        list.add(new Student("涨三", 1));
        list.add(new Student("涨三", 2));
        list.add(new Student("涨三", 3));
        list.add(new Student("涨三", 4));
        list.add(new Student("涨三", 5));
//        Arrlist();
        listIteratorMath();
    }

    private static void studentMap() {
        Student[] arr = new Student[5];
        arr[0] = new Student("张三", 1);
        arr[1] = new Student("张2", 2);
        arr[2] = new Student("张3", 3);
        arr[3] = new Student("张4", 4);
        arr[4] = new Student("张5", 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr[i].getName());
        }
    }

    private static void CollectionMath() {
        Collection c = new ArrayList();
        c.add(new Student("涨三", 2));
        c.add(new Student("涨三", 3));
        c.add(new Student("涨三", 4));
        c.add(new Student("涨三", 5));
        c.add(new Student("涨三", 6));
        //将集合转换成数组
        Object[] a = c.toArray();
        //向下转型
        for (int i = 0; i < a.length; i++) {
            Student student = (Student) a[i];
            System.out.println(student.getName());
        }
    }

    private static void Arrlist() {

//        Iterator iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            Student student = (Student) iterator.next();
//            System.out.println(student.getName() + ",,,," + student.getAge());
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * 在平常使用中list是不能添加元素，回报同步锁的异常
     * 在迭代中向集合添加元素
     */
    private static void listIteratorMath() {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Student student = (Student) listIterator.next();
            if (student.getAge() == 2) {
                 listIterator.add(new Student("黄三",18));
            }
        }
        System.out.println(list);

    }
}





















