package test;

import main.Lesson_14_DZ;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberAfter4_Test {
    private Lesson_14_DZ lesson14Dz;

    @BeforeEach
    public void init() {
        lesson14Dz = new Lesson_14_DZ();
    }

    @Test
    public void test1_ArrayAfter4() {
        int[] array = {1, 2, 4, 5, 6};
        int[] arrayAfter4 = {5, 6};
        Assertions.assertArrayEquals(arrayAfter4, lesson14Dz.numbersAfterFour(array));
    }

    @Test
    public void test2_ArrayAfter4() {
        int[] array = {1, 2, 4, 5, 4, 6, 0, 9};
        int[] arrayAfter4 = {6, 0, 9};
        Assertions.assertArrayEquals(arrayAfter4, lesson14Dz.numbersAfterFour(array));
    }

    @Test
    public void test3_ArrayAfter4() {
        int[] array = {1, 2, 0, 5, 1, 6, 0, 9};
        Assertions.assertThrows(RuntimeException.class, () -> {
            lesson14Dz.numbersAfterFour(array);
        });
    }

}
