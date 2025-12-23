package LatestInterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// How do you get the details of the youngest male employee in the Development department using java 8.

public class YoungestMaleEmployeeDetails {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Lalbaboo", "Male", "IT", 70000.00, 36 ));
        list.add(new Employee(102, "Abhimanyu", "Male", "Development", 50000.00, 86 ));
        list.add(new Employee(103, "Simpi", "Female", "Development", 77000.00, 19 ));
        list.add(new Employee(104, "Abhimanyu", "Male", "Account", 70000.00, 22 ));
        list.add(new Employee(105, "Bharti", "Female", "HR", 98000.00, 56 ));

        Optional<Employee> youngestMaleInDev = list.stream().filter(e->e.getGender().equalsIgnoreCase("Male"))
                .filter(e->e.getDepartment().equalsIgnoreCase("Development"))
                .min(Comparator.comparingInt(Employee::getAge));

        youngestMaleInDev.ifPresent(System.out::println);
    }
}
