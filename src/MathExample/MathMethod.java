package MathExample;

/**
 * @Author: HuangZiTeng
 * @Date: 15:20 2018/3/5 0005
 * @ClassUse:
 * @Modified: no
 */
public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.PI);  //获取π
        System.out.println(Math.abs(12.3)); //获取绝对值
        System.out.println(Math.ceil(13.3)); //向上取整
        System.out.println(Math.floor(13.3));//向下取整
        System.out.println(Math.max(13.3, 13.7));//获取最大值
        System.out.println(Math.pow(2, 3));//2.0的3.0次方
        System.out.println(Math.random());//生成0.1 and 1.0 不包含头尾
        System.out.println(Math.round(12.3f));//四舍五入
    }
}
