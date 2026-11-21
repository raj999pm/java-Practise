package com.java.practise.companies.jpmc;

import java.util.*;
import java.util.stream.Collectors;

public class EmpDepartment {


    static void main() {

        Employee emp1 = new Employee(122,"Prudish", 12000, 100);
        Employee emp2 = new Employee(132,"Sanjay", 14000, 200);
        Employee emp3 = new Employee(142,"Ramesh", 16000, 300);
        Employee emp4 = new Employee(152,"Suresh", 16000, 400);
        Employee emp5 = new Employee(162,"Eithne", 17000, 500);
        Employee emp6 = new Employee(172,"Bigness", 18000, 600);

        List<Employee> employeesList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
        Map<Integer, Optional<Employee>> topByDept = employeesList.stream()
                .collect(Collectors.groupingBy(
                        Employee::deptId,
                        Collectors.maxBy(Comparator.comparingLong(Employee::empSalary))));

        topByDept.forEach((dept, emp) -> System.out.println(dept + " -> " + emp.get()));

    }
}
