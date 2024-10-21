package ie.atu.customer_management;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("addCustomer")
    public String addCustomer(@RequestBody @Valid Customer customer){
        System.out.println(customer.toString());
        customerService.addCustomer(customer);
        return "Added Customer: " + customer;
    }

    @GetMapping("getCustomer/{id}")
    public String getCustomer(@PathVariable long id){
        Optional<Customer> customer = customerService.getCustomerByID(id);
        if (customer.isPresent()){
            return "Customer found: " + customer;
        }else{
            return "Error Customer Not found";
        }
    }
}
