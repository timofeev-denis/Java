package integertoroman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by: Denis Timofeev
 * Date: 02.05.2019
 */
@DisplayName("Integer to roman notation converter test")
class ConverterTest {

    private Converter converter = new Converter();

    @Test
    void oneTest() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    void twoTest() {
        assertEquals("II", converter.convert(2));
    }

    @Test
    void treeTest() {
        assertEquals("III", converter.convert(3));
    }

    @Test
    void fourTest() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    void fiveTest() {
        assertEquals("V", converter.convert(5));
    }

    @Test
    void sixTest() {
        assertEquals("VI", converter.convert(6));
    }

    @Test
    void sevenTest() {
        assertEquals("VII", converter.convert(7));
    }

    @Test
    void eightTest() {
        assertEquals("VIII", converter.convert(8));
    }

    @Test
    void nineTest() {
        assertEquals("IX", converter.convert(9));
    }

    @Test
    void tenTest() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    void fiftyTest() {
        assertEquals("L", converter.convert(50));
    }

    @Test
    void hundredTest() {
        assertEquals("C", converter.convert(100));
    }

    @Test
    void fiveHundredsTest() {
        assertEquals("D", converter.convert(500));
    }

    @Test
    void thousandTest() {
        assertEquals("M", converter.convert(1000));
    }

    @Test
    void longNumberTest() {
        assertEquals("MMMCDLIX", converter.convert(3459));
    }

    @Test
    void negativeNumberThrowsExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(-1));
    }

    @Test
    void tooBigNumberThrowsExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(4000));
    }

}