package com.colvir.homework.simpleApp.service;

import com.colvir.homework.simpleApp.model.Employee;
import com.colvir.homework.simpleApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findById(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }
    public Employee update(Integer id, Employee employeeDetails) {
        Employee employee = findById(id);
        if (employee != null) {

            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
            employee.setSalary(employeeDetails.getSalary());
            employee.setDepartment(employeeDetails.getDepartment());
            return employeeRepository.save(employee);
        } else {
            return null;
        }
    }

    public void delete(Integer id) {
        employeeRepository.delete(id);
    }


}

