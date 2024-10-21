package ie.atu.customer_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer) {
        System.out.println(customer);
        customerRepository.save(customer);
    }

    public Optional<Customer> getCustomerByID(long Id){
        return customerRepository.findById(Id);
    }
}
