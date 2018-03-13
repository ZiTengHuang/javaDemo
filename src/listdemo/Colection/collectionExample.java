package listdemo.Colection;

import listdemo.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author:MyHzt
 * @ClassName: collection Math
 * @Date:Created in 21:19 2018/3/10 0010
 */
public class collectionExample {
    public static void main(String[] args) {
        Collection  c = new ArrayList();
        boolean b1 = c.add(true);
        boolean b2 = c.add("abc");
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student("张三",13));
        boolean b5 = c.add("abc");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(c);
    }
}
