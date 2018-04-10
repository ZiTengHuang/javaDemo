package Observer;

import java.util.ArrayList;

/**
 * @Author: HuangZiTeng
 * @Date: 9:21 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getName() + "添加" + observer);
    }

    public void dettch(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getName() + "删除" + observer);
    }

    /**
     * 通知所有更新消息
     *
     * @param msg 更新的消息
     */
    public void notifyObservers(String msg) {

        for (Observer observer : observers) {

            observer.update(msg);
        }
    }
}
