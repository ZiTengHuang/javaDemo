package ObserverDemo;

/**
 * @Author: HuangZiTeng
 * @Date: 15:11 2018/4/9 0009
 * @ClassUse: 所作出的行动类
 * @Modified: no
 */
public class ActionSubject extends Subject {

    public void change(String msg) {
        notifyObservers(msg);
    }
}
