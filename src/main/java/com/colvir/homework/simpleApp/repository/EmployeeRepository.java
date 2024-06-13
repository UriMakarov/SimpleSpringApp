package com.colvir.homework.simpleApp.repository;

import com.colvir.homework.simpleApp.model.Employee;
import lombok.RequiredArgsConstructor;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;



@Repository
@RequiredArgsConstructor
public class EmployeeRepository {
    private final JdbcTemplate jdbcTemplate;

    private final BeanPropertyRowMapper<Employee> beanPropertyRowMapper = new BeanPropertyRowMapper<>(Employee.class);
    private final Set<Employee> employees = new HashSet<>();




    public Employee save(Employee employee) {
//        Session session = getSessionFactory().openSession();
//        session.beginTransaction();
//        session.persist(employee);
//        session.getTransaction().commit();
//        session.close();
//       return employee;
        String preparedStatementString = "INSERT INTO employees VALUES(?, ?, ?, ?, ?);";
        jdbcTemplate.update(preparedStatementString,
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getPayments(),
                employee.getDepartment());

        return employee;
    }


    public List<Employee> findAll() {

//        return employees;

        return null;
    }

    public Optional<Employee> findById(Integer id) {
//        return employees.stream()
//                .filter(Employee -> Employee.getId().equals(id))
//                .findFirst();
        return null;
    }


//    public Employee update(Employee employeeForUpdate) {
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//
////        for (Employee employee : employees) {
////            if (employee.getId().equals(employeeForUpdate.getId())) {
////                employee.setFirstName(employeeForUpdate.getFirstName());
////                employee.setLastName(employeeForUpdate.getLastName());
////                employee.setSalary(employeeForUpdate.getSalary());
////                employee.setDepartment(employeeForUpdate.getDepartment());
////            }
//        }
//        return employeeForUpdate;
//    }

//    public Employee delete(Integer id) {
//        Employee employeeForDelete = employees.stream()
//                .filter(employee -> employee.getId().equals(id))
//                .findFirst().get();
//        employees.remove(employeeForDelete);
//        return employeeForDelete;
  }


