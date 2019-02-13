package matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixSearchTest {

    @Test
    void contains() {
        int width = 4;
        int height = 6;
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 2, 2, 2},
                {2, 2, 3, 3},
                {2, 3, 5, 6},
                {2, 3, 6, 6},
                {2, 3, 6, 6}};
        assertTrue(MatrixSearch.contains(matrix, width, height, 5));
        assertTrue(MatrixSearch.contains(matrix, width, height, 6));
        assertFalse(MatrixSearch.contains(matrix, width, height, 7));
    }
}