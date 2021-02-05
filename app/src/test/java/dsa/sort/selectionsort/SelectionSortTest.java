package dsa.sort.selectionsort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    void selectionSortTest() {
        int[] actual = { 20, 35, -15, 7, 55, 1, -22 };
        int[] expected = { -22, -15, 1, 7, 20, 35, 55 };
        SelectionSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
