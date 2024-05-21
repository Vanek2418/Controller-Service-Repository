package by.makhno.spring.demo.service;

import by.makhno.spring.demo.data.Employee;

public interface EmployeeService {
    int getEmployeeCount();
    int getEmployeeAvgSalary();
    Employee getEmployeeMinSalary();

}
