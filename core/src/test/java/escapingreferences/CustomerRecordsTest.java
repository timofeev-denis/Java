package escapingreferences;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка 'убегающих' ссылок")
class CustomerRecordsTest {

    @Test
    @DisplayName("Создание коллекции через конструктор с параметром не даёт менять исходную коллекцию")
    void collectionMutability() {
        List<Customer> data = Arrays.asList(
                new Customer("john", 21),
                new Customer("bill", 48),
                new Customer("adam", 33)
        );
        CustomerRecords records = new CustomerRecords(data);
        List<Customer> newRecords = records.getCustomers();
        newRecords.clear();
        assertEquals(0, newRecords.size());
        assertEquals(3, records.getCustomers().size());
        assertEquals(3, data.size());
    }

}