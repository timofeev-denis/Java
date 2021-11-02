package dummy;

import org.junit.jupiter.api.Test;

/**
 * Created by: Denis Timofeev
 * Date: 22.09.2019
 */
class DummyTest {

    private Dummy dummy = new Dummy();

    DummyTest() {
        super();
        System.err.println("DummyTest constructor has been called");
    }

    @Test
    void testOne() {
        dummy.doStuff("one");
    }

    @Test
    void testTwo() {
        dummy.doStuff("two");
    }
}
