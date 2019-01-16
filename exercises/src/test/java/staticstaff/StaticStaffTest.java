package staticstaff;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test static methods")
class StaticStaffTest {

    @Test
    @DisplayName("Call static method on null variable")
    void callStaticMethodOnNull() {
        StaticMethod cls = null;
        cls.foo();
    }

    @Test
    void setStaticVariable() {
        assertEquals("init", StaticVariable.str);
        StaticVariable.str = "test";
        assertEquals("test", StaticVariable.str);
    }
}