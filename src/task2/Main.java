package task2;

import java.util.Arrays;

/**
 * Отсортируйте массив {@code [5, 6, 3, 2, 5, 1, 4, 9]}
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
