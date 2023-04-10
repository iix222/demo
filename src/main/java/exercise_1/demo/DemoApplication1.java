package exercise_1.demo;

import exercise_1.demo.model.Customer;
import exercise_1.demo.model.Student;
import exercise_1.demo.service.CustomerService;
import exercise_1.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootApplication
public class DemoApplication1 implements CommandLineRunner {

	@Autowired
	private StudentService studentService;
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setFirstname("John");
		student.setLastname("Doe");
		student.setAge(20);
		student.setGrade(5);
		student.getId();
		studentService.saveStudent(student);

		Student student2 = new Student();
		student2.setFirstname("Jane");
		student2.setLastname("Doe");
		student2.setAge(22);
		student2.setGrade(4);
		student2.getId();
		studentService.saveStudent(student2);

		Customer customer = new Customer();
		customer.setFirstname("Alex");
		customer.setLastname("Johnson");
		customerService.registerCustomer(customer);

		Customer customer2 = new Customer();
		customer2.setFirstname("Lina");
		customer2.setLastname("Alas");
		customerService.registerCustomer(customer2);

		List<Customer> customers = customerService.getAllCustomers();
		System.out.println("Here is the list of customers: " + customers);

		List<Student> students = studentService.getAllStudents();
		System.out.println("Here is the list of students: " + students);

		List<Student> johnStudents = studentService.findStudentByFirstname("John");
		System.out.println("Here are the students with firstname John: " + johnStudents);

		studentService.deleteStudentById(1L);

		List<Student> johnStudents1 = studentService.findStudentByFirstname("John");
		System.out.println("Here are the students with firstname John: " + johnStudents1);
	}
}
