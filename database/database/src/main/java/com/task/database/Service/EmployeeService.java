package com.task.database.Service;

import com.task.database.Model.Employee;
import com.task.database.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    public Employee updateEmployee(Long id, Employee employeeDetails) {
        // Fetch the existing employee or throw an exception if not found
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));

        // Update the fields
        existingEmployee.setName(employeeDetails.getName());
        existingEmployee.setAge(employeeDetails.getAge());
        existingEmployee.setRole(employeeDetails.getRole());
        existingEmployee.setAddress(employeeDetails.getAddress());
        return employeeRepository.save(existingEmployee);
    }

}

