package stringExample;

/**
 * @Author:MyHzt
 * @ClassName: 数组排序啊
 * @Date:Created in 21:40 2018/3/3 0003
 */
public class bubilingSorts {
    public static void main(String[] args) {
        int[] arr = {1, 34, 22, 13, 55, 77};
        System.out.println(arr.length);
        int a = 12;
        bubilingSort(arr);
        showSort(arr);
    }

    private static void bubilingSort(int[] arr) {
        //总共只要比较比长度少一次的次数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void showSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

        }
    }
}
