package task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int row = 5;
        int col = 6;
        findMaxMinMiddleNumber(fillArray(row, col));
    }

    private static int randomNumber() throws InterruptedException {
        GregorianCalendar gcalendar = new GregorianCalendar();
        Thread.sleep(7);
        return gcalendar.get(Calendar.MILLISECOND);
    }

    private static void findMaxMinMiddleNumber(int[][] arrays) {
        int maxNumber = arrays[0][0], minNumber = arrays[0][0];
        int sum = 0;
        for (int[] array : arrays) {
            for (int j : array) {
                if (j > maxNumber) {
                    maxNumber = j;
                }
                if (j < minNumber) {
                    minNumber = j;
                }
                sum += j;
            }
        }
        System.out.println("Maximum number = " + maxNumber + "\n" + "Minimum number = " + minNumber);
        System.out.println("Middle number = " + sum / (arrays[0].length * arrays[1].length));
    }

    private static int[][] fillArray(int row, int col) throws InterruptedException {
        int[][] twoDimArray = new int[row][col];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = randomNumber();
            }
        }
        for (int[] anArr : twoDimArray) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        return twoDimArray;
    }
}
