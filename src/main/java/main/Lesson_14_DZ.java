package main;

import java.util.stream.IntStream;

public class Lesson_14_DZ {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 4, 4, 0, 2, 7, 8, 9};
        for (int i :
                numbersAfterFour(array)) {
            System.out.println(i);
        }

        int[] array2 = {4, 1, 4};
        System.out.println(containsOneFour(array2));
    }

    public static boolean containsOneFour(int[] arrayForCheck) {
        boolean result = false;

        if (IntStream.of(arrayForCheck).anyMatch(x -> x == 4) && IntStream.of(arrayForCheck).anyMatch(x -> x == 1)) {
            result = true;
        }

        if (IntStream.of(arrayForCheck).anyMatch(x -> x != 4 && x != 1)) {
            result = false;
        }

        return result;
    }

    public static int[] numbersAfterFour(int[] arrayForCheck) {
        int[] numbersAfter4 = null;
        for (int i = arrayForCheck.length - 1; i > -1; i--) {
            if (arrayForCheck[i] == 4) {
                numbersAfter4 = new int[arrayForCheck.length - i - 1];
                System.arraycopy(arrayForCheck, i + 1, numbersAfter4, 0, numbersAfter4.length);
                break;
            }
            if (i == 0) {
                throw new RuntimeException("Во входном массиве нету ни одной цифры \"4\"");
            }
        }
        return numbersAfter4;
    }
}