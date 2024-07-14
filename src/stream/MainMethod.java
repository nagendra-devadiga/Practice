package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MainMethod {
    public static void main(String[] args) {
        List<Employee> employees = GenerateEmployee.generateEmployee();

        for (Employee e: employees) {
            System.out.println(e);
        }
        System.out.println("---------------------------------------------------");

        /**
         * Group by department
         */
        Map<String, List<Employee>> collect = employees.stream().collect(groupingBy(Employee::getDepartment));
        collect.entrySet().forEach(System.out::println);
        System.out.println("-----------------------------------------------------");


        /**
         * get the highest salary
         */
        Employee reduce = employees.stream().reduce(employees.get(0), (employee1, employee2) -> {
            return Double.compare(employee1.getSalary(), employee2.getSalary()) > 0 ? employee1 : employee2;
        });

        System.out.println("Highest salary using reduce: " + reduce);
        System.out.println("-----------------------------------------------------");

        /**
         * get the highest salary using max
         */
        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Highest salary max: " + max.get());

        System.out.println("-----------------------------------------------------");


        /**
         * Highest salary in each department
         */
        Map<String, Optional<Employee>> collect1 = employees.stream().collect(groupingBy(Employee::getDepartment, Collectors.reducing((employee, employee2) -> {
            return Double.compare(employee.getSalary(), employee2.getSalary()) > 0 ? employee : employee2;
        })));

        collect1.forEach((key, value) -> System.out.println("Highest salary in department : " + key + " is emp: " + value.get()));
        System.out.println("-----------------------------------------------------");


        /**
         * Employee count in each department
         */

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((key, value) -> {
                    System.out.println("Count in each department "+ key + " is "+ value);
                });


        /**
         * Employee gender count in each department
         */
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender, Collectors.counting())))
                .forEach((key, value) -> {
                    System.out.println("Gender count in each department "+ key + " is "+ value);
                });


        System.out.println("----------------------- summary -----------------------");

        /**
         * Summarize salary
         */
        DoubleSummaryStatistics collect2 = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average salary: " + collect2.getAverage());
        System.out.println("Max salary: " + collect2.getMax());
        System.out.println("Min salary: " + collect2.getMin());
        System.out.println("Sum of salary: " + collect2.getSum());
        System.out.println("Count: " + collect2.getCount());

        System.out.println("--------------------------------------------------------------");


        /**
         * Summarize salary by each department
         */
        employees.stream()
                .collect(groupingBy(Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary)))
                .forEach((key, value) -> {
                    System.out.println("Average salary in department " + key +" is " + value.getAverage());
                    System.out.println("Max salary in department " + key +" is " + value.getMax());
                    System.out.println("Min salary in department " + key +" is " + value.getMin());
                    System.out.println("Sum of salary in department " + key +" is " + value.getSum());
                    System.out.println("Count in department " + key +" is " + value.getCount());
                    System.out.println(" ********************** ");
                });


        System.out.println("---------------------------------------------");

        /**
         * Summarize salary by each department by gender
         */
        employees.stream()
                .collect(groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(Employee::getGender, Collectors.summarizingDouble(Employee::getSalary))
                ))
                .forEach((key, value) -> {
                    System.out.println("In department: " + key);
                    value.forEach((k, v) -> {
                        System.out.println("Avg salary for gender: "+ k + " is "+ v.getAverage());
                        System.out.println("Max salary in department " + k +" is " + v.getMax());
                        System.out.println("Min salary in department " + k +" is " + v.getMin());
                        System.out.println("Sum of salary in department " + k +" is " + v.getSum());
                        System.out.println("Count in department " + k +" is " + v.getCount());
                        System.out.println(" ==================  ");
                    });
                    System.out.println("***********************");
                });
        System.out.println("-------------------------------------------------");
    }

}
