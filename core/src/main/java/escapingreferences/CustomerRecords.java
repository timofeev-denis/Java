package escapingreferences;

import java.util.ArrayList;
import java.util.List;

public class CustomerRecords {

    private List<Customer> customers;

    public CustomerRecords(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return new ArrayList<Customer>(customers);
    }
}
