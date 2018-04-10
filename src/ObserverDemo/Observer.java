package ObserverDemo;

/**
 * @Author: HuangZiTeng
 * @Date: 14:54 2018/4/9 0009
 * @ClassUse: 订阅者
 * @Modified: no
 */
public interface Observer {

    public String getName();

      void update(String msg);
}
