package com.colvir.homework.simpleApp;

import com.colvir.homework.simpleApp.model.Employee;
import com.colvir.homework.simpleApp.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class
SimpleAppApplicationTests {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void whenSaveEmployee_thenCheckFields() {
		Employee employee = new Employee(1, "Иван", "Петров", 1000.0, "Отдел разработки");
		Employee savedEmployee = employeeRepository.save(employee);
		assertEquals(savedEmployee.getId(), employee.getId());
		assertEquals(savedEmployee.getFirstName(), employee.getFirstName());
		assertEquals(savedEmployee.getLastName(), employee.getLastName());
		assertEquals(savedEmployee.getSalary(), employee.getSalary());
		assertEquals(savedEmployee.getDepartment(), employee.getDepartment());
	}

}
