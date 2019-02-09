package quicksort;

/**
 * Created by: Denis Timofeev
 * Date: 09.02.2019
 */
class QuickSort {

    static void sort(int[] array, int begin, int end) {
        int b = begin, e = end;
        int pivot = array[b + (e - b) / 2];
        while (b < e) {
            while (array[b] < pivot) {
                b++;
            }
            while (array[e] > pivot) {
                e--;
            }
            if (b <= e) {
                int swp = array[b];
                array[b] = array[e];
                array[e] = swp;
                b++;
                e--;
            }
        }

        if (begin < e) {
            sort(array, begin, e);
        }
        if (b < end) {
            sort(array, b, end);
        }
    }
}
