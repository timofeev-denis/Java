package primitives;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing primitive data types operations")
public class PrimitivesTest {

    private static final Long CONSTANT_LONG = 1000L;

    @Test
    @DisplayName("Compare primitive data type and Object")
    void comparisionTest() {
        Long a = 1000L;
        Long b = 1000L;

        assertTrue(a.equals(1000L));
        assertTrue(a.equals(b));
        assertTrue(a.equals(CONSTANT_LONG));
        assertFalse(a == CONSTANT_LONG);
        assertFalse(a == b);
    }
}
