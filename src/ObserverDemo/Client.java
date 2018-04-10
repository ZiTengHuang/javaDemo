package ObserverDemo;

/**
 * @Author: HuangZiTeng
 * @Date: 15:16 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public class Client {
    public static void main(String[] args) {
        Observer observer = new BFObserver("黄小腾");
        Observer observer2 = new BFObserver("黄大腾");
        ActionSubject actionSubject = new ActionSubject();
        actionSubject.attch(observer);
        actionSubject.attch(observer2);
        actionSubject.change("啊哈哈哈哈");
        actionSubject.dttch(observer2);
        actionSubject.change("啊哈哈哈哈");

    }
}
