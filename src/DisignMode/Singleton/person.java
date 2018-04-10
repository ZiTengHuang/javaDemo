package DisignMode.Singleton;

/**
 * @Author: HuangZiTeng
 * @Date: 16:17 2018/4/9 0009
 * @ClassUse:
 * @Modified: no
 */
public class person {


    //自我初始化本实例
    private static person PERSON;

    //构造函数私有化
    private person() {
    }

    //提供一个全局的访问静态方法
    public static  person getPerson() {
        if (PERSON == null) {
            PERSON = new person();
        }
        return PERSON;
    }
}
