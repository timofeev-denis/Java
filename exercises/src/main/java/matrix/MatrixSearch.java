package matrix;

/**
 * Searches an element in matrix.
 * For every element in matrix the following conditions are met:
 * <p>- element to the right is equal or more then the element itself</p>
 * <p>- element below is equal or more then the element itself</p>
 */
class MatrixSearch {

    static boolean contains(int[][] matrix, int x) {
        assertMatrixIsValid(matrix);
        int width = matrix[0].length;
        for (int[] aMatrix : matrix) {
            if (aMatrix[width - 1] < x) {
                continue;
            }

            for (int j = 0; j < width; j++) {
                if (aMatrix[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks matrix validity
     *
     * @param matrix Matrix
     */
    private static void assertMatrixIsValid(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix supposed to be not null");
        }
        if (matrix.length < 1) {
            throw new IllegalArgumentException("Matrix height is less then 1");
        }
        int width = matrix[0].length;
        if (width < 1) {
            throw new IllegalArgumentException("Matrix width is less then 1");
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != width) {
                throw new IllegalArgumentException(String.format("Row %d length (%d) is not equal to other rows lengths", i, matrix[i].length));
            }
        }
    }
}
