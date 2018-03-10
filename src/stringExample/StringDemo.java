package stringExample;

/**
 * @Author:MyHzt
 * @ClassName:
 * @Date:Created in 21:10 2018/3/1 0001
 */
public class StringDemo {

    public static void main(String[] args) {
//        intArrTransitionString();
        //stringMethod();
//        System.out.println(stringBufferArrayToString());
        stringAndStringBuffer();
//        bubilingSort();
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

    /**
     * 【1,2,3】
     *
     * @return String 保存的数组对象
     */
    private static String stringBufferArrayToString() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuffer.append(arr[i]).append("]");

            } else {
                stringBuffer.append(arr[i]).append(",");
            }
        }
        return stringBuffer.toString();
    }

    private static void stringAndStringBuffer() {
        String s1 = new String();
        StringBuffer stringBuffer = new StringBuffer();
        s1 = "aaaaaa";


        stringBuffer.append("aaaaaaa");
        stringBuffer.append("bbbbbbb");
        int i1;
        i1 = 11111;
        System.out.println(i1);
        showType(i1);
        System.out.println(i1);
    }

    private static void showType(int a) {
        a += 12;
        System.out.println(a);
    }


    private static void bubilingSort() {
        int[] arr = {1, 43, 22, 56, 99, 13, 5};
        System.out.println(arr.length);
        int[] countArr;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempSum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempSum;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

