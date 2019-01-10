package gc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by: Denis Timofeev
 * Date: 08.12.2018
 */
@DisplayName("Работа со сборщиком мусора")
public class GarbageCollectorTest {

    @Test
    void getAvailableMemory() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory() / 1024 / 1024 + " Mb");
    }
}
