package stringExample;

import java.util.Arrays;

/**
 * @Author: HuangZiTeng
 * @Date: 10:05 2018/3/5 0005
 * @ClassUse: 排序列子
 * @Modified: no
 */
public class SortExample {

    public static void main(String[] args) {
        int[] arr = {2, 14, 33, 11, 7, 99, 55, 38, 84, 6, 8};
        Arrays.sort(arr);
//        bubblingSort(arr);
//        selectSort(arr);
        printSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblingSort(int[] arr) {
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

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    private static void printSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
