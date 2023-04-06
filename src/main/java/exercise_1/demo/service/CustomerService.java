package exercise_1.demo.service;

import exercise_1.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Igor Grišin
 * @Date 4/6/2023
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void saveCustomer(){
        int number = 29;
        if(number > 25) {
            System.out.println("Exercise is working");
            customerRepository.saveCustomer();
        }
    }

}
