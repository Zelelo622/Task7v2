package ru.vsu.num6.tests;

import org.junit.*;
import ru.vsu.num6.logic.SumArrayElements;

import static org.junit.Assert.assertEquals;

public class TestSumArrayElements {

    @Test
    public void testGetSumOfElements1() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual = sumArrayElements.getSumOfElements(new int[]{1000, 2, 3, 4, 0});
        assertEquals(9, actual);
    }

    @Test
    public void testGetSumOfElements2() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual2 = sumArrayElements.getSumOfElements(new int[]{0, 15, 1700, 121, 74, 197, 1600, -10, 0, -1});
        assertEquals(1992, actual2);
    }

    @Test
    public void testGetSumOfElements3() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual3 = sumArrayElements.getSumOfElements(new int[]{0, 1, 2, 3, 4});
        assertEquals(0, actual3);
    }

    @Test
    public void testGetSumOfElements4() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual4 = sumArrayElements.getSumOfElements(new int[]{10, 10, 10, 10, 10});
        assertEquals(0, actual4);
    }

    @Test
    public void testGetSumOfElements5() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual5 = sumArrayElements.getSumOfElements(new int[]{0, 1500, 0, -10, 115, -1548, -10500});
        assertEquals(-1443, actual5);
    }

    @Test
    public void testGetSumOfElements6() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual6 = sumArrayElements.getSumOfElements(new int[]{154, 2, -1051, 5, 10});
        assertEquals(2, actual6);
    }

    @Test
    public void testGetSumOfElements7() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual7 = sumArrayElements.getSumOfElements(new int[]{10, 0, 1, 2, 3, 4, 5, -1});
        assertEquals(15, actual7);
    }

    @Test
    public void testGetSumOfElements8() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual8 = sumArrayElements.getSumOfElements(new int[]{-10, 2, 3, 40, -20});
        assertEquals(0, actual8);
    }

    @Test
    public void testGetSumOfElements9() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual9 = sumArrayElements.getSumOfElements(new int[]{0, -1, 0, -2, 0});
        assertEquals(-1, actual9);
    }

    @Test
    public void testGetSumOfElements10() {
        SumArrayElements sumArrayElements = new SumArrayElements();
        int actual10 = sumArrayElements.getSumOfElements(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        assertEquals(45, actual10);
    }
}
