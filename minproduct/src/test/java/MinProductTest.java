import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinProductTest {

    @Test
    void findMinProduct() {
        int[] arr = new int[]{9, 4, 2, 5, 3};
        assertEquals(6, MinProduct.findMinProduct(arr));
    }

    @Test
    void lessThenTwoElementsThrowsException() {
        int[] arr = new int[]{9};
        assertThrows(IllegalArgumentException.class, () -> MinProduct.findMinProduct(arr));
    }

    @Test
    void sameElementsTest() {
        int[] arr = new int[]{2, 4, 2, 5, 3};
        assertEquals(4, MinProduct.findMinProduct(arr));
    }

//    @Test
//    void sameElementsTest() {
//        int[] arr = new int[]{2, 4, 2, 5, 3};
//        assertEquals(4, MinProduct.findMinProduct(arr));
//    }

/*
Дана последовательность целых чисел. Необходимо найти минимально возможное произведение пары элементов последовательности.
Например, для последовательности чисел 9 4 2 5 3 ответ будет 6.

{-1, -2, -3, -4} => 2
{-1, -2, 3, 4} => -8




 */
//    {-1, -2, -3, -4} => 2
//    {-1, -2, 3, 4} => -8
}