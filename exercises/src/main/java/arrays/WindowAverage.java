package arrays;

/**
 * An array of integers is given, the number N is given,
 * which determines the size of the "window" in this array.
 * Write a class implementation that allows you
 * to walk along a given array in one direction
 * and at each step returns the average value of N current elements
 */
class WindowAverage {

    static double[] average(int[] array, int windowSize) {
        assertValidArguments(array, windowSize);
        double[] result = new double[array.length - windowSize + 1];
        int resultIndex = 0;
        for (int i = 0; i <= array.length - windowSize; i++) {
            result[resultIndex++] = getAverage(array, i, i + windowSize - 1);
        }
        return result;
    }

    /**
     * Calculates average value of array elements
     *
     * @param array      The array
     * @param startIndex Index of the first element
     * @param stopIndex  Index of the last element
     * @return Calculated average value
     */
    static double getAverage(int[] array, int startIndex, int stopIndex) {
        double result = 0;
        for (int i = startIndex; i <= stopIndex; i++) {
            result += array[i];
        }
        return result / (stopIndex - startIndex + 1);
    }

    /**
     * Validates array and window size. Throws {@link IllegalArgumentException} if validation fails.
     *
     * @param array      Array
     * @param windowSize Size of a window
     */
    private static void assertValidArguments(int[] array, int windowSize) {
        if (windowSize <= 0) {
            throw new IllegalArgumentException("Window size cannot be negative or equal to zero");
        }
        if (windowSize > array.length) {
            throw new IllegalArgumentException("Window size cannot be greater then array length");
        }
    }

}
