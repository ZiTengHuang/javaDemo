package Observer;

/**
 * @Author: HuangZiTeng
 * @Date: 14:11 2018/4/9 0009
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
        System.out.println("消息是：" + msg);
    }
}
