package by.makhno.spring.demo.data;

import lombok.Data;

@Data
public class Employee {

    private final String name;
    private final int salary;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary;
    }
}


