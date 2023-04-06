package exercise_1.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Igor Grišin
 * @Date 4/6/2023
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;

    private Integer age;

    private Integer grade;
}


// Create a student model that has a unique id
// and firstname and lastname  and age and grade.