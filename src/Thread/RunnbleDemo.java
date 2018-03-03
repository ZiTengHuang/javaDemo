package Thread;

/**
 * @Author:MyHzt
 * @ClassName: 使用runnable
 * @Date:Created in 16:13 2018/2/12 0012
 */
public class RunnbleDemo {

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t =new Thread(runnable);
        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("bbbbbbbbbbb");
        }
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("aaaaaaaaaa");
            }
        }
    }
}
