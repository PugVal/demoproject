package org.demoproject.Service;

import org.demoproject.Model.Employee;

import java.util.List;

public interface EmployeeService
{

    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
