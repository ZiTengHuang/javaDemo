package ObserverDemo;

import java.util.ArrayList;

/**
 * @Author: HuangZiTeng
 * @Date: 14:56 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public abstract class Subject {

    //定义个集合保存订阅者
    private ArrayList<Observer> observers = new ArrayList<>();

    public void attch(Observer observer) {
        observers.add(observer);
        System.out.println("新增订阅者：" + observer.getName());
    }

    public void dttch(Observer observer) {
        observers.remove(observer);
        System.out.println("删除订阅者：" + observer.getName());
    }

    public void notifyObservers(String statr) {
        for (Observer observer : observers) {
             observer.update(statr);
        }
    }
 }
