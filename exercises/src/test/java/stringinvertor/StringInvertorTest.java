package stringinvertor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringInvertorTest {

    @Test
    void invertThreeCharsString() {
        String result = StringInvertor.invert("abc");
        assertEquals("cba", result);
    }

    @Test
    void invertOneCharString() {
        String result = StringInvertor.invert("z");
        assertEquals("z", result);
    }

    @Test
    void invertEmptyString() {
        String result = StringInvertor.invert("");
        assertEquals("", result);
    }

    @Test
    void invertFourCharsString() {
        String result = StringInvertor.invert("abcd");
        assertEquals("dcba", result);
    }

    @Test
    void invertSevenCharsString() {
        String result = StringInvertor.invert("abcdefg");
        assertEquals("gfedcba", result);
    }

    @Test
    void invertEightCharsString() {
        String result = StringInvertor.invert("abcdefgh");
        assertEquals("hgfedcba", result);
    }
}