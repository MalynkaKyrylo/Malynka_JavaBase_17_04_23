package ua.hillel.malynka.lessons.lesson16;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.hillel.malynka.lessons.lesson16.HomeworkTask18;


public class TestHomeworkTask18 {
    static int[][] array1 = null;
    static int[][] array2 = null;
    static int[][] array3 = null;

    @BeforeAll
    static void beforeAll() {
        array1 = new int[0][0];
        array2 = new int[][] {{1, 2}, {3, 4}};
        array3 = new int[][] {{1, 2}, {3, 4},{5,6}};
    }
    @Test
    void testMethod1() {
        System.out.println("testMethod1");
        Assertions.assertEquals(false, HomeworkTask18.squareMatrixCheck(null));
        Assertions.assertTrue(HomeworkTask18.arrayAverage(null)==0.0);
    }
    @Test
    void testMethod2() {
        System.out.println("testMethod2");
        Assertions.assertEquals(false, HomeworkTask18.squareMatrixCheck(array1));
        Assertions.assertTrue(HomeworkTask18.arrayAverage(array1)==0.0);
    }
    @Test
    void testMethod3() {
        System.out.println("testMethod2");
        Assertions.assertEquals(true, HomeworkTask18.squareMatrixCheck(array2));
        Assertions.assertTrue(HomeworkTask18.arrayAverage(array2)==2.5);
    }

    @Test
    void testMethod4() {
        System.out.println("testMethod4");
        Assertions.assertEquals(false, HomeworkTask18.squareMatrixCheck(array3));
        Assertions.assertTrue(HomeworkTask18.arrayAverage(array3) == 3.5);
    }

    @AfterAll
    static void afterAll() {
        array1 = null;
        array2 = null;
        array3 = null;
    }

}
