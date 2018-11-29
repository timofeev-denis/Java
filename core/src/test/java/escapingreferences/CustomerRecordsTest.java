package escapingreferences;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Проверка 'убегающих' ссылок")
class CustomerRecordsTest {

    private CustomerRecords records;

    @BeforeEach
    void setUp() {
        List<Customer> data = new ArrayList<Customer>() {{
            add(new Customer("john", 21));
            add(new Customer("bill", 48));
            add(new Customer("adam", 33));
        }};
        records = new CustomerRecords(data);
    }

    @Test
    @DisplayName("Создание коллекции через конструктор с параметром не даёт менять исходную коллекцию")
    void collectionImmutability() {
        List<Customer> newRecords = records.getNewCustomersCollection();
        newRecords.clear();
        assertEquals(0, newRecords.size());
        assertEquals(3, records.getNewCustomersCollection().size());
        assertEquals(3, records.getCustomers().size());
    }

    @Test
    @DisplayName("Изменение коллекции, полученной через обычный геттер, изменяет исходную коллекцию")
    void collectionMutability() {
        List<Customer> newCustomers = records.getCustomers();
        newCustomers.clear();
        assertEquals(0, records.getCustomers().size());
    }

    @Test
    @DisplayName("Изменение коллекции, полученной через unmodifiableList бросает исключение")
    void unmodifiableList() {
        List<Customer> readOnlyCustomers = records.getReadOnlyCustomers();
        assertThrows(UnsupportedOperationException.class, readOnlyCustomers::clear);
    }
}