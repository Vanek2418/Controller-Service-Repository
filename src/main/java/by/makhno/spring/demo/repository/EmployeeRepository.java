package by.makhno.spring.demo.repository;

import by.makhno.spring.demo.data.Employee;

public interface EmployeeRepository {
    int getEmployeeCount();

    int getEmployeeAvgSalary();

    Employee getEmployeeMinSalary();
}
