package LatestInterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeWithMaxSalary {
    public static void main(String[] args) {

        // How to get the employee with the max salary from a list.

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Lalbaboo", "Male", "IT", 70000.00, 36 ));
        list.add(new Employee(102, "Abhimanyu", "Male", "HR", 50000.00, 86 ));
        list.add(new Employee(103, "Simpi", "Female", "IT", 77000.00, 19 ));
        list.add(new Employee(104, "Abhimanyu", "Male", "Account", 70000.00, 22 ));
        list.add(new Employee(105, "Bharti", "Female", "HR", 98000.00, 56 ));


        Optional<Employee>  employeeMaxSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary));

        employeeMaxSalary.ifPresent(System.out::println);
    }

}
