package dsa.sort.bubblesort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    void bubbleSortTest() {
        int[] actual = { 20, 35, -15, 7, 55, 1, -22 };
        int[] expected = { -22, -15, 1, 7, 20, 35, 55 };
        BubbleSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
