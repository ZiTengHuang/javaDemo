package HashSet;

import listdemo.person;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: HuangZiTeng
 * @Date: 15:08 2018/3/28 0028
 * @ClassUse: 树形节点
 * @Modified: no
 */
public class ExampleTreeSet {
    public static void main(String[] args) {
        ExampleTreeSet treeSet = new ExampleTreeSet();
        treeSet.test3();
    }

    /**
     * TreeSet初次使用[1, 2, 3]
     * 保持元素的唯一 并且能排序的集合
     * compareTo 方法返回为0 的时候 集合只有一个元素
     * 放回为1 的时候全部都出来 顺序
     * -1的时候  到序出来
     * Tree是二叉树 他的到序或正序或集合只有一个之和compareTo 有关。因为二叉树
     * 的排序
     */
    private void test1() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet);
    }

    /**
     *
     */
    private void test2() {
        TreeSet<person> treeSet = new TreeSet<>();
        treeSet.add(new person("张三", 1));
        treeSet.add(new person("张4", 2));
        treeSet.add(new person("张5", 3));
        treeSet.add(new person("张6", 5));
        treeSet.add(new person("张7", 4));
        System.out.println(treeSet);
    }

    /**
     * 以长度为主要条件比较 需要重写Comparator   compare方法
     */
    private void test3() {
        TreeSet<String> treeSet = new TreeSet<>(new CompareBylen());
        treeSet.add("aaaaaaaaaaa");
        treeSet.add("bbbbbb");
        treeSet.add("azzzzaaaaa");
        treeSet.add("arrr");
        treeSet.add("abbbaaaaaaa");
        System.out.println(treeSet);
    }
    class CompareBylen implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int num = o1.length() - o2.length();
            return num == 0 ? o1.compareTo(o2) : num;
        }
    }
}
