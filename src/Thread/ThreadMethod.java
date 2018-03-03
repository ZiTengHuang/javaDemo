package Thread;

/**
 * @Author:MyHzt
 * @ClassName: Thread的方法集合
 * @Date:Created in 16:37 2018/2/12 0012
 */
public class ThreadMethod {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                System.out.println(this.getName() + "aaaaa");
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                System.out.println(this.getName() + "bbbbbb");
            }
        }.start();
    }
}
