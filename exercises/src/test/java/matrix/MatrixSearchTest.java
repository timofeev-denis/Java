package matrix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Matrix search test")
class MatrixSearchTest {

    @Test
    @DisplayName("Positive case")
    void contains() {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 2, 2, 2},
                {2, 2, 3, 3},
                {2, 3, 5, 6},
                {2, 3, 6, 6},
                {2, 3, 6, 6}};
        assertTrue(MatrixSearch.contains(matrix, 5));
        assertTrue(MatrixSearch.contains(matrix, 6));
        assertFalse(MatrixSearch.contains(matrix, 7));
    }

    @Test
    @DisplayName("Null matrix validation throws exception")
    void nullMatrixValidityTest() {
        int[][] matrix = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> MatrixSearch.contains(matrix, 1));
        assertEquals("Matrix supposed to be not null", exception.getMessage());
    }

    @Test
    @DisplayName("Empty matrix validation throws exception")
    void emptyMatrixValidityTest() {
        int[][] matrix = {};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> MatrixSearch.contains(matrix, 1));
        assertEquals("Matrix height is less then 1", exception.getMessage());
    }

    @Test
    @DisplayName("Matrix with variable rows lengths validation throws exception")
    void matrixWithDifferentRowLengthsValidityTest() {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 2, 2},
                {2, 3, 6, 6}};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> MatrixSearch.contains(matrix, 1));
        assertEquals("Row 1 length (3) is not equal to other rows lengths", exception.getMessage());
    }

    @Test
    @DisplayName("Matrix with empty rows validation throws exception")
    void matrixWithEmptyRowsValidityTest() {
        int[][] matrix = {{}, {}, {}};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> MatrixSearch.contains(matrix, 1));
        assertEquals("Matrix width is less then 1", exception.getMessage());
    }
}