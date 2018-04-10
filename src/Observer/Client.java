package Observer;

/**
 * @Author: HuangZiTeng
 * @Date: 14:14 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public class Client {

    public static void main(String[] args) {
        Observer observer = new BFObserver("黄小腾");
        MassageSubject massageSubject = new MassageSubject();
        massageSubject.attach(observer);
        massageSubject.change("我在大保健");

    }
}
