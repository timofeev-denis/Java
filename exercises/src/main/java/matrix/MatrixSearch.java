package matrix;

/**
 * Searches an element in matrix.
 * For every element in matrix the following conditions are met:
 * <p>- element to the right is equal or more then the element itself</p>
 * <p>- element below is equal or more then the element itself</p>
 */
class MatrixSearch {

    static boolean contains(int[][] matrix, int width, int height, int x) {
        for (int i = 0; i < height; i++) {
            if (matrix[i][0] > x) {
                return false;
            }
            if (matrix[i][width - 1] < x) {
                continue;
            }

            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
