package Thread;

/**
 * @Author:MyHzt
 * @ClassName:  匿名类部类
 * @Date:Created in 16:29 2018/2/12 0012
 */
public class Demo_Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("aaaaaaaaaaaaa");
        }
          new Thread(){
              @Override
              public void run() {
                  super.run();
                  for (int i = 0; i < 10000; i++) {
                      System.out.println("bbbbbbbbbb");
                  }
              }
          }.start();

          new Thread(new Runnable() {
              @Override
              public void run() {

              }
          }).start();
    }
}
