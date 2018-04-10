package Observer;

/**
 * @Author: HuangZiTeng
 * @Date: 14:12 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public class MassageSubject extends Subject {

    public void change(String msg) {
        notifyObservers(msg);
    }
}
