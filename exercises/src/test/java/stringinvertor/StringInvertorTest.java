package stringinvertor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringInvertorTest {

    @Test
    void invertThreeCharsString() {
        String result = StringInvertor.invertWithCharSwitching("abc");
        assertEquals("cba", result);
    }

    @Test
    void invertOneCharString() {
        String result = StringInvertor.invertWithCharSwitching("z");
        assertEquals("z", result);
    }

    @Test
    void invertEmptyString() {
        String result = StringInvertor.invertWithCharSwitching("");
        assertEquals("", result);
    }

    @Test
    void invertFourCharsString() {
        String result = StringInvertor.invertWithCharSwitching("abcd");
        assertEquals("dcba", result);
    }

    @Test
    void invertSevenCharsString() {
        String result = StringInvertor.invertWithCharSwitching("abcdefg");
        assertEquals("gfedcba", result);
    }

    @Test
    void invertEightCharsString() {
        String result = StringInvertor.invertWithCharSwitching("abcdefgh");
        assertEquals("hgfedcba", result);
    }
}