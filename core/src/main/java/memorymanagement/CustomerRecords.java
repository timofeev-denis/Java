package memorymanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CustomerRecords {

    private final List<Customer> customers;

    CustomerRecords(List<Customer> customers) {
        this.customers = customers;
    }

    List<Customer> getNewCustomersCollection() {
        return new ArrayList<>(customers);
    }

    List<Customer> getCustomers() {
        return customers;
    }

    List<Customer> getReadOnlyCustomers() {
        return Collections.unmodifiableList(this.customers);
    }
}
