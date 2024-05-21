package by.makhno.spring.demo.repository;

import by.makhno.spring.demo.data.Employee;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000));

    @Override
    public int getEmployeeCount() {
        return employeeList.size();
    }

    @Override
    public int getEmployeeAvgSalary() {
        int avgSalary = 0;
        for (Employee employee : employeeList) {
            avgSalary += employee.getSalary();
        }
        return avgSalary / employeeList.size();
    }

    @Override
    public Employee getEmployeeMinSalary() {

        if (!employeeList.isEmpty()) {

            return employeeList.stream()
                    .min(Comparator.comparingDouble(Employee::getSalary))
                    .get();

        } else {
            return null;
        }
    }

}
