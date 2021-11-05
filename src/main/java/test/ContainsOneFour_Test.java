package test;

import main.Lesson_14_DZ;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainsOneFour_Test {
    private Lesson_14_DZ lesson14Dz;

    @BeforeEach
    public void init() {
        lesson14Dz = new Lesson_14_DZ();
    }

    @Test
    public void test1_ContainsOneFour() {
        int[] array = {1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(Lesson_14_DZ.containsOneFour(array));
    }

    @Test
    public void test2_ContainsOneFour() {
        int[] array = {1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(Lesson_14_DZ.containsOneFour(array));
    }

    @Test
    public void test3_ContainsOneFour() {
        int[] array = {4, 4, 4, 4};
        Assertions.assertFalse(Lesson_14_DZ.containsOneFour(array));
    }

    @Test
    public void test4_ContainsOneFour() {
        int[] array = {1, 1, 1, 4, 2, 1, 4, 4};
        Assertions.assertFalse(Lesson_14_DZ.containsOneFour(array));
    }
}
