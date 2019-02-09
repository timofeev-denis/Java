package quicksort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by: Denis Timofeev
 * Date: 09.02.2019
 */
class QuickSortTest {

    @Test
    void sort() {
        int[] array = {2, 2, 2, 1, 1, 1};
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array, 0, array.length - 1);
        System.out.println("SORTED: " + Arrays.toString(array));
    }

    @Test
    void sort2() {
        int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array, 0, array.length - 1);
        System.out.println("SORTED: " + Arrays.toString(array));
    }
    @Test
    void sort3() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array, 0, array.length - 1);
        System.out.println("SORTED: " + Arrays.toString(array));
    }
}