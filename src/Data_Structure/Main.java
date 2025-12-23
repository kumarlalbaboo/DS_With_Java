package Data_Structure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Lalbaboo", "Male", "IT", 75000.00, 28 ));
        list.add(new Employee(102, "Abhimanyu", "Male", "IT", 80000.00, 29 ));
        list.add(new Employee(103, "Pritam", "Male", "HR", 55000.00, 21 ));
        list.add(new Employee(104, "Radha", "Female", "HR", 45000.00, 23 ));
        list.add(new Employee(105, "Niraj", "Male", "IT", 120000.00, 30 ));

        // //##. Find the employees who are getting the 2nd highest salary
        Double secondHighest = list.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println("Second highest: "+secondHighest);

        Double res = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElseThrow().getSalary();
        System.out.println("Second highest: "+res);

        List<Employee> res1 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).skip(1).collect(Collectors.toList());
                        res1.forEach(e-> System.out.println(e.getName()+ " getting salary : "+e.getSalary()));


        // Given Employee class, calculate average and total salary, and filter employees from a particular department.
        Double avg = list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
        System.out.println("Average: "+avg);

        Double total = list.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total: "+total);

        List<Employee> emp =
                list.stream().filter(e->e.getDepartment() == "IT").collect(Collectors.toList());
        emp.forEach(e-> System.out.println(e.getName()+" getting salary: "+e.getSalary()));

        //Find a list of names starting with the letter 'A'.

        

    }
}
