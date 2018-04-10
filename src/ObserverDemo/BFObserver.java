package ObserverDemo;

/**
 * @Author: HuangZiTeng
 * @Date: 15:13 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public class BFObserver implements Observer {

    public BFObserver(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "知道得到消息:" + msg);
    }
}
