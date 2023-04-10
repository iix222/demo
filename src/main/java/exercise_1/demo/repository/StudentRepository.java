package exercise_1.demo.repository;

import exercise_1.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Igor Grišin
 * @Date 4/6/2023
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findById(Long id);
    List<Student> findByFirstname(String firstname);
}
