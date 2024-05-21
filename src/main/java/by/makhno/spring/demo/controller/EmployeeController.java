package by.makhno.spring.demo.controller;

import by.makhno.spring.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/count")
    public String getEmployeeCount() {
        return "Количество сотрудников: " + employeeService.getEmployeeCount();
    }

    @GetMapping("/avg-salary")
    public String getEmployeeAvgSalary() {
        return "Средняя зарплата: " + employeeService.getEmployeeAvgSalary();
    }

    @GetMapping("/min-salary")
    public String getEmployeeMinSalary() {
        return "Сотрудник с минимальной зарплатой " + employeeService.getEmployeeMinSalary();
    }
}
