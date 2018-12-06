package memorymanagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Проверка изменения аргументов")
class ArgumentPassTest {

    @Test
    @DisplayName("Присваивание аргументу null не изменяет исходный объект")
    void mutateArgument() {
        Customer john = new Customer("John", 21);
        CustomerModificator modificator = new CustomerModificator();
        assertNotNull(john);
        modificator.setArgumentNull(john);
        assertNotNull(john);
    }

    class CustomerModificator {
        @SuppressWarnings("UnusedAssignment")
        void setArgumentNull(Customer customer) {
            customer = null;
        }
    }
}
