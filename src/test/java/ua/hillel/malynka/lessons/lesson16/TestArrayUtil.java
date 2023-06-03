package ua.hillel.malynka.lessons.lesson16;

import org.junit.jupiter.api.*;
import ua.hillel.malynka.lessons.lesson16.ArrayUtil;

public class TestArrayUtil {
    static int[] array = null;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
        array = new int[] {1, 2, 3, 4, 5};
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
//    @Disabled("Will be fix soon")
    void testMethod1() {
        System.out.println("testMethod1");
        Assertions.assertEquals(-3, ArrayUtil.getIndexElement(null, 10));
    }

    @Test
    void testMethod2() {
        System.out.println("testMethod2");
        Assertions.assertEquals(-2, ArrayUtil.getIndexElement(new int[] {}, 10));
    }

    @Test
    void testMethod3() {

        Assertions.assertTrue(ArrayUtil.getIndexElement(array, 2) == 1);
    }

    @Test
    void testMethod4() {

        Assertions.assertFalse(ArrayUtil.getIndexElement(new int[] {1,2,3}, 3) == 1);
    }

    @Test
    void testMethod5() {
        Assertions.assertTrue(ArrayUtil.getIndexElement(new int[] {1,2,3}, 6) == -1);
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll all");
        array = null;
    }
}
