package quicksort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by: Denis Timofeev
 * Date: 09.02.2019
 */
@DisplayName("Test QuickSort implementation")
class QuickSortTest {

    @Test
    @DisplayName("{2, 2, 2, 1, 1, 1}")
    void sort() {
        int[] array = {2, 2, 2, 1, 1, 1};
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array);
        System.out.println("SORTED: " + Arrays.toString(array));
    }

    @Test
    @DisplayName("{8, 0, 4, 7, 3, 7, 10, 12, -3}")
    void sort2() {
        int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array);
        System.out.println("SORTED: " + Arrays.toString(array));
    }

    @Test
    @DisplayName("{1, 2, 3, 4, 5}")
    void sort3() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array);
        System.out.println("SORTED: " + Arrays.toString(array));
    }

    @ParameterizedTest(name = "Batch test [{index}]")
    @ArgumentsSource(RandomArrayProvider.class)
    void batchTest(int[] array) {
        QuickSort.sort(array);
        assertArrayIsSorted(array);
    }

    /**
     * Provides arrays of random length with random values
     */
    static class RandomArrayProvider implements ArgumentsProvider {
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.generate(createIntArray())
                    .limit(100)
                    .map(Arguments::of);
        }

        private Supplier<int[]> createIntArray() {
            Random random = new Random();
            return () -> Stream.generate(() ->
                    random.nextInt(100))
                    .limit(random.nextInt(100))
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }

    /**
     * Checks if array is sorted ascending
     */
    void assertArrayIsSorted(int[] array) {
        if (array.length < 2) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                throw new RuntimeException("Array is not sorted: " + Arrays.toString(array));
            }
        }
    }
}