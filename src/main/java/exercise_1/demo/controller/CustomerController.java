package exercise_1.demo.controller;

import exercise_1.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Igor Grišin
 * @Date 4/6/2023
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
