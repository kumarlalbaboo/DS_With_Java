package Interview.Practice.JDK8Example;

import LatestInterviewQuestions.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Jdk8EmployeeClassExample {

    public static void main(String[] args) {

        ArrayList<LatestInterviewQuestions.Employee> list = new ArrayList<>();

        list.add(new LatestInterviewQuestions.Employee(101, "Lalbaboo", "Male", "IT", 70000.00, 36 ));
        list.add(new LatestInterviewQuestions.Employee(102, "Abhimanyu", "Male", "HR", 50000.00, 86 ));
        list.add(new LatestInterviewQuestions.Employee(103, "Simpi", "Female", "IT", 77000.00, 19 ));
        list.add(new LatestInterviewQuestions.Employee(104, "Abhimanyu", "Male", "Account", 70000.00, 22 ));
        list.add(new LatestInterviewQuestions.Employee(105, "Bharti", "Female", "HR", 98000.00, 56 ));

        // ## Remove duplicates from an array.
        Integer[] arr5 = {1, 2, 3, 2, 4, 1, 5};
        Arrays.stream(arr5).distinct().forEach(e->System.out.print(e+" "));

        System.out.println();
        //##. Write a code to move all zero elements to the end side using Java 8.
        Integer[] arrays = {1,0,1,0,0,1,0,1};
        Arrays.stream(arrays).sorted( (a,b)->a == 0 ? 1 : -1).forEach(e->System.out.print(e+" "));

        Integer[] resss = Stream.concat(Arrays.stream(arrays).filter(e->e != 0),
                Arrays.stream(arrays).filter(e->e == 0)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(resss));

        System.out.println();
        //##. Find the employee with the highest salary
        list.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        System.out.println();
        //##. Find the top 4 employees with the highest salary
        List<Employee> collect = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(4).collect(Collectors.toList());
        collect.forEach(e->System.out.println(e.getName()+" - "+e.getSalary()));

        System.out.println();
        //##. Find the employees who are getting the 2nd highest salary
        List<Employee> list3 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).skip(1).toList();
        list3.forEach(e->System.out.println(e.getName()+" - "+e.getSalary()));

        System.out.println();
        //1. Sort employee based on salary
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(e->System.out.println(e.getName()+" - "+e.getSalary()));

        System.out.println();
        //2. Sort employee based on name
        list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println();
        //3. Count the total number of employees
        long count = list.stream().count();
        System.out.println(count);

        System.out.println();
        //4. Count the total number of employees based on department/name.
        Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        collect1.forEach((dept, counting)->System.out.println(dept+" - "+counting));

        System.out.println();
        //5. Concatenate two lists using flatmap
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9);
        List<List<Integer>> list5 = Arrays.asList(list1, list2);
        List<Integer> collect2 = list5.stream().flatMap(Collection::stream).toList();
        collect2.forEach(e->System.out.print(e+" "));

        System.out.println();
        //6. Find avg,max,min,sum,count salary of employee
        DoubleSummaryStatistics stats = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Count: "+stats.getCount());

        System.out.println();
        //7. Find the name of all employee
        list.stream().map(Employee::getName).forEach(e->System.out.println(e));

        System.out.println();
        //8. Find the distinct name of employee
        list.stream().map(Employee::getName).distinct().forEach(e->System.out.println(e));

        System.out.println();
        //9. Get employee name whose employee id is greater than 102
        list.stream().filter(e->e.getId() > 102).map(Employee::getName).forEach(System.out::println);

        System.out.println();
        //10. Find an employee name whose age is less than 40
        list.stream().filter(e->e.getAge() > 40).map(Employee::getName).forEach(System.out::println);

        System.out.println();
        //11. Sum of square of array number
        int[] arr = {1,2,3,4,5,6};
        int sum = Arrays.stream(arr).map(e -> e * e).sum();
        System.out.println(sum);

        System.out.println();
        //12. Sum of square of only even number
        int sum1 = Arrays.stream(arr).filter(e -> e % 2 == 0).map(e->e*e).sum();
        System.out.println(sum1);

        System.out.println();
        //13. Display name start with 'S'
        list.stream().map(Employee::getName).filter(e->e.startsWith("S")).forEach(System.out::println);

        System.out.println();
        //14. Display name starts with 'A' and the age is greater than 40
        list.stream().filter(e->e.getName().startsWith("A") && e.getAge() > 40)
                .map(Employee::getName).forEach(System.out::println);

        System.out.println();
        //15. Sort the array value and print in ascending order
        Integer[] array = {33,86,23,65,50};
        Arrays.stream(array).sorted().forEach(e->System.out.print(e+" "));

        System.out.println();
        //16. Sort the array value print in descending order
        Arrays.stream(array).sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));

        System.out.println();
        //17. Find max value in arrays
        Optional<Integer> max = Arrays.stream(array).max(Integer::compareTo);
        max.ifPresent(System.out::println);

        System.out.println();
        //18. Find min value in arrays
        Arrays.stream(array).min(Integer::compareTo).ifPresent(System.out::println);

        System.out.println();
        //19. To find the First maximum number
        Arrays.stream(array).sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);

        System.out.println();
        //20. To find second maximum number
        Arrays.stream(array).sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        System.out.println();
        //21. To find third maximum number
        Arrays.stream(array).sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);
        System.out.println();
        //22. Find the first minimum number in arrays
        Arrays.stream(array).sorted().findFirst().ifPresent(System.out::println);

        System.out.println();
        //23. Find the second minimum number in arrays
        Arrays.stream(array).sorted().skip(1).findFirst().ifPresent(System.out::println);

        System.out.println();
        //24. Find the third minimum number in arrays
        Arrays.stream(array).sorted().skip(2).findFirst().ifPresent(System.out::println);

        System.out.println();
        //25. Find a name whose length is greater than 5.
        list.stream().filter(e->e.getName().length() > 5).map(Employee::getName).forEach(System.out::println);

        System.out.println();
        //26. Find the occurrences of each character in string
        String string = "abcdca";
        LinkedHashMap<String, Long> collect3 = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect3.forEach((k,v)->System.out.println(k+" - "+v));

        System.out.println();
        //27. Find the first repeating character
        Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println();
        //28. Find first Non-Repeating character
        Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println();
        //29. Find the occurrences of each word
        String[] word = {"radha", "shayam", "radha", "shayam", "lalbaboo", "abhimanyu" };
        LinkedHashMap<String, Long> collect4 = Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect4.forEach((k,v)->System.out.println(k+" - "+v));

        System.out.println();
        //30. Display a duplicate element with count
        Map<String, Long> collect5 = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        collect5.forEach((k,v)->System.out.println(k+" - "+v));

        System.out.println();
        //31. Non-Duplicate element with count
        Map<String, Long> collect6 = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        collect6.forEach((k,v)->System.out.println(k+" - "+v));

        System.out.println();
        //32. Find a duplicate element in string
        List<String> stringStream = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        stringStream.forEach(e-> System.out.print(e+" "));

        System.out.println();
        //33. Find a distinct element in string
        Arrays.stream(string.split("")).distinct().forEach(e-> System.out.print(e+" "));

        System.out.println();
        //34. Find the longest string in a String array     //reduce() function is a terminal operation in streams used to combine elements into a single result.
        String[] stringArray = {"Java", "SpringBoot", "Microservices", "Spring", "Hibernate"};
        Arrays.stream(stringArray).reduce((a,b)->a.length() > b.length() ? a : b).ifPresent(System.out::println);

        Arrays.stream(stringArray)
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        System.out.println();
        //35. Find the smallest string in a String array
        Arrays.stream(stringArray)
                .min(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        System.out.println();
        //36. Write a program to find elements from arrays who start with 1.
        Integer[] arr1 = {45, 11, 34, 15, 24};
        Arrays.stream(arr1).map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);

        System.out.println();
        //37. String joiner example
        List<String> strings = Arrays.asList("Hello", "Lalbaboo", "Kumar");
        String res = strings.stream().collect(Collectors.joining(" "));
        System.out.println(res);

        System.out.println();
        //38. Display fruits/brand and its count
        List<String> fruits = Arrays.asList("banana", "apple", "samsung", "motorola", "apple", "samsung");
        fruits.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v)->System.out.println(k+" - "+v));

        System.out.println();
        //39. Sort an employee based on salary if salary same then sort on based of name.
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);




    }
}
