package exercise_1.demo.repository;

import exercise_1.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Igor Grišin
 * @Date 4/6/2023
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


