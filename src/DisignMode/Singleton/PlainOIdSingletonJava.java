package DisignMode.Singleton;

/**
 * @Author: HuangZiTeng
 * @Date: 13:51 2018/4/10 0010
 * @ClassUse:
 * @Modified: no
 */
public class PlainOIdSingletonJava {
    // volatile 关键字：保证实例化的时候它的赋值和构造方法调用是有序的 在别的线程看到的会是正确的
    private static volatile PlainOIdSingletonJava INSTANCE;

    private PlainOIdSingletonJava() {
    }

    public static PlainOIdSingletonJava getInstance() {
        //先判断是否为null  是null在加锁， 不是就直接返回
        if (INSTANCE == null) {
            synchronized (PlainOIdSingletonJava.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PlainOIdSingletonJava();
                }
            }
        }
        return INSTANCE;
    }
}
