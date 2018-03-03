package stringExample;

/**
 * @Author:MyHzt
 * @ClassName:
 * @Date:Created in 21:10 2018/3/1 0001
 */
public class StringDemo {

    public static void main(String[] args) {
//        intArrTransitionString();
        stringMethod();
    }

    /**
     * 数组中的数据按照指定格式拼接成一个字符
     */
    private static void intArrTransitionString() {
        int[] arr = {1, 2, 3};
        String s1 = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                s1 += arr[i] + ",";
            } else {
                s1 += arr[i] + "}";
            }
        }
        System.out.println("result:" + s1);
    }
    /**
     * String的各种功能演示
     */
    private static void stringMethod() {
        //简单的替换
        String s1 = "abababababababab";
        System.out.println(s1.replace("a", "s"));

    }
}
