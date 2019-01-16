package staticmethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test static methods")
class ClassWithStaticMethodTest {

    @Test
    @DisplayName("Call static method on null variable")
    void callStaticMethodOnNull() {
        ClassWithStaticMethod cls = null;
        cls.foo();
    }
}