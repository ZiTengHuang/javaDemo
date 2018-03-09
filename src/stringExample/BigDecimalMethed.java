package stringExample;

import java.math.BigDecimal;

/**
 * @Author: HuangZiTeng
 * @Date: 11:06 2018/3/6 0006
 * @ClassUse:
 * @Modified: no
 */
public class BigDecimalMethed {

    public static void main(String[] args) {
        System.out.println(2.0-1.1); //==0.899999无限接近计算机是这样
        BigDecimal bigDecimal = BigDecimal.valueOf(2.1);
        BigDecimal bigDecimal1= BigDecimal.valueOf(1.9);
        System.out.println(        bigDecimal.subtract(bigDecimal1));
    }

}
