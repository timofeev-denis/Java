package bubblesort;

class BubbleSort {

    static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swp = array[i];
                    array[i] = array[j];
                    array[j] = swp;
                }
            }
        }
        return array;
    }
}
