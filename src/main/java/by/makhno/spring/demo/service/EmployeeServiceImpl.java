package by.makhno.spring.demo.service;

import by.makhno.spring.demo.data.Employee;
import by.makhno.spring.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Override
    public int getEmployeeCount() {
        return employeeRepository.getEmployeeCount();
    }

    @Override
    public int getEmployeeAvgSalary() {
        return employeeRepository.getEmployeeAvgSalary();
    }

    @Override
    public Employee getEmployeeMinSalary() {
        return employeeRepository.getEmployeeMinSalary();
    }
}
