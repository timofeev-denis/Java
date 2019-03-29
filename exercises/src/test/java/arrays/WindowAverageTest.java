package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test window average value calculation")
class WindowAverageTest {

    @Test
    @DisplayName("Calculate average")
    void calculateAverage() {
        double[] average = WindowAverage.average(new int[]{1, 2, 3, 4, 4, 6}, 2);
        assertEquals(5, average.length);
        assertEquals(1.5, average[0]);
        assertEquals(2.5, average[1]);
        assertEquals(3.5, average[2]);
        assertEquals(4, average[3]);
        assertEquals(5, average[4]);
    }

    @Test
    @DisplayName("Calculate average when window equals array length")
    void calculateAverageWhenWindowEqualsArrayLength() {
        double[] average = WindowAverage.average(new int[]{10, 2}, 2);
        assertEquals(1, average.length);
        assertEquals(6, average[0]);
    }

    @Test
    @DisplayName("Too big window throws exception")
    void tooBigWindowThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> WindowAverage.average(new int[]{1}, 2));
        assertEquals("Window size cannot be greater then array length", exception.getMessage());
    }

    @Test
    @DisplayName("Negative window size throws exception")
    void negativeWindowThrowsException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> WindowAverage.average(new int[]{1}, -1));
        assertEquals("Window size cannot be negative or equal to zero", exception.getMessage());
    }

    @Test
    @DisplayName("Zero window size throws exception")
    void zeroWindowThrowsException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> WindowAverage.average(new int[]{1}, 0));
        assertEquals("Window size cannot be negative or equal to zero", exception.getMessage());
    }

    @Test
    @DisplayName("Calculate average value")
    void getAverage() {
        double average = WindowAverage.getAverage(new int[]{2, 2, 2}, 0, 2);
        assertEquals(2, average);
    }
}