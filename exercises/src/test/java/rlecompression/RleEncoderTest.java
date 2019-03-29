package rlecompression;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("RLE encoding")
class RleEncoderTest {

    @Test
    @DisplayName("Вызов с сустой строкой возвращает пустую строку")
    void emptyString() {
        assertEquals("", RleEncoder.encode(""));
    }

    @Test
    @DisplayName("Вызов с null бросает IllegalArgumentException")
    void nullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> RleEncoder.encode(null));
    }

    @Test
    @DisplayName("Строка из одного символа")
    void singleChar() {
        assertEquals("A", RleEncoder.encode("A"));
    }

    @Test
    @DisplayName("Строка из трёъ разных символов")
    void threeDifferentChars() {
        assertEquals("ABC", RleEncoder.encode("ABC"));
    }

    @Test
    @DisplayName("Строка из двух одинаковых символов")
    void twoSameChars() {
        assertEquals("A2", RleEncoder.encode("AA"));
    }

    @Test
    @DisplayName("Длинная строка из разных символов")
    void longString() {
        assertEquals("A4B3C2XYZD4E3F3A6B28", RleEncoder.encode("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
    }

    @Test
    @DisplayName("СТрока с цифрами бросает IllegalArgumentException")
    void numberChars() {
        assertThrows(IllegalArgumentException.class, () -> RleEncoder.encode("AA99"));
    }

}