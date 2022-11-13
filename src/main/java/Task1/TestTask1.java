package Task1;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestTask1 {
    private final Task1 task1 = new Task1();

    @Test
    public void arrayPositiveSortingTest() {

        assertArrayEquals(new int[]{5, 3, 2, 1, 0}, task1.positiveSorter(new int[]{-3, -2, 5, -5, 1, 0, 2, 3}));

        assertArrayEquals(new int[]{}, task1.positiveSorter(new int[]{-3, -2}));

        assertArrayEquals(new int[]{}, task1.positiveSorter(new int[]{}));
    }


}
