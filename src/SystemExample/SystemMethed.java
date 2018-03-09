package SystemExample;

/**
 * @Author: HuangZiTeng
 * @Date: 10:08 2018/3/6 0006
 * @ClassUse:
 * @Modified: no
 */
public class SystemMethed {
    public static void main(String[] args) {
//         new Demo();
//         System.gc();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("*");
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
        copyArray();
    }

    static class Demo {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    }

    private static void copyArray() {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("============");
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
