package org.demoproject.Service;

import org.demoproject.Model.Employee;
import org.demoproject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public void addEmployee(Employee employee) {
     employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
    employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
     employeeRepository.delete(id);
    }
}
