package bubblesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void sort() {
        int[] array = new int[]{6, 3, 29, 0, -1};
        int[] expected = new int[]{-1, 0, 3, 6, 29};
        assertArrayEquals(expected, BubbleSort.sort(array));
    }

    void printArray(int[] array) {
        for (int i : array) {
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
        }
    }
}