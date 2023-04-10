package exercise_1.demo.service;

import exercise_1.demo.model.Customer;
import exercise_1.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Igor Grišin
 * @Date 4/6/2023
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers(){
       return customerRepository.findAll();

    }
}
