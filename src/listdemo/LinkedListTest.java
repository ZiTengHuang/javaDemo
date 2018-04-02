package listdemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author:MyHzt
 * @ClassName: LinkedList
 * implements List<E>, Deque<E>。实现List接口，
 * 能对它进行队列操作，即可以根据索引来随机访问集合中的元素。
 * 同时它还实现Deque接口，即能将LinkedList当作双端队列
 * @Date:Created in 21:52 2017/11/22 0022
 */
public class LinkedListTest {
    public static void main(String[] args) {
        linkedListMath();
    }

    private static void linkedListMath() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");
        linkedList.addFirst("d");
        linkedList.addFirst("e");
        linkedList.addLast("r");

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.get(2));
    }

    /**
     * 模拟栈结构
     */
    private static void LinkedListMath2() {
            
    }
}
