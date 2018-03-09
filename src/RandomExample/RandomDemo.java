package RandomExample;

import java.util.Random;

/**
 * @Author: HuangZiTeng
 * @Date: 16:00 2018/3/5 0005
 * @ClassUse:
 * @Modified: no
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(random.nextInt(1000));
        }
    }
}
