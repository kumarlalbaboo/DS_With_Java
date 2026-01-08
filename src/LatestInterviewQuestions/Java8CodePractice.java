package LatestInterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Java8CodePractice {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Lalbaboo", "Male", "IT", 70000.00, 36 ));
        list.add(new Employee(102, "Abhimanyu", "Male", "HR", 50000.00, 86 ));
        list.add(new Employee(103, "Simpi", "Female", "IT", 77000.00, 19 ));
        list.add(new Employee(104, "Abhimanyu", "Male", "Account", 70000.00, 22 ));
        list.add(new Employee(105, "Bharti", "Female", "HR", 98000.00, 56 ));

        // ## Remove duplicates from an array.
        Integer[] arr5 = {1, 2, 3, 2, 4, 1, 5};
        Integer[] array5 = Arrays.stream(arr5).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array5));

        //##. Write a code to move all zero elements to the end side using Java 8.
        Integer[] arrays = {1,0,1,0,0,1,0,1};

        Integer[] array1 = Arrays.stream(arrays).sorted((a, b) -> a == 0 ? 1 : -1).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));

        Integer[] resss = Stream.concat(Arrays.stream(arrays).filter(e->e != 0),
                Arrays.stream(arrays).filter(e->e == 0)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(resss));

        //##. Find the employee with the highest salary
        Optional<Employee>  employeeMaxSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary));
        employeeMaxSalary.ifPresent(System.out::println);

        //##. Find the top 4 employees with the highest salary
        List<Employee> top4 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .limit(4).collect(Collectors.toList());
        top4.forEach(e->System.out.println(e.getName()+" - "+e.getSalary()));


        //##. Find the employees who are getting the 2nd highest salary
        List<Employee> secondHighest = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2).skip(1).collect(Collectors.toList());
        secondHighest.forEach(e-> System.out.println("Second highest salary getting: "+e.getName()+" and salary is: "+e.getSalary()));

        //##. Find the employees who are getting the 3rd highest salary
        List<Employee> thirdHighest = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3).skip(2).collect(Collectors.toList());
        thirdHighest.forEach(e-> System.out.println("Third highest salary getting: "+e.getName()+" and salary is: "+e.getSalary()));

        //##. Find the employees who are getting the 3rd highest salary if multiple persons have the same salary
        List<Double> topSalaries = list.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).toList();

        if(topSalaries.size() >= 3){
            Double thirdHighestSalary = topSalaries.get(2);

            List<Employee> res4 = list.stream().filter(e->e.getSalary().equals(thirdHighestSalary) ).toList();

            res4.forEach(e-> System.out.println(e.getName()+" - "+e.getSalary()));
        }

        System.out.println();
        //1. Sort employee based on salary
        list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        System.out.println();
        //2. Sort employee based on name
        list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println();
        //3. Count the total number of employees
        long count = list.stream().count();
        System.out.println("Count: "+count);

        System.out.println();
        //4. Count the total number of employees based on department/name.
        Map<String, Long> mapVal = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(mapVal);

        System.out.println();
        //5. Concatenate two lists using flatmap
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9);

        List<List<Integer>> listVal = Arrays.asList(list1, list2);
        System.out.println(listVal);

        List<Integer> finalResult = listVal.stream().flatMap(e -> e.stream())
                .collect(Collectors.toList());
        System.out.println(finalResult);

        System.out.println();
        //6. Find avg,max,min,sum,count salary of employee
        DoubleSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Count: "+stats.getCount());

        System.out.println();
        //7. Find the name of all employee
        list.stream().map(Employee::getName).forEach(System.out::println);

        System.out.println();
        //8. Find the distinct name of employee
        list.stream().map(Employee::getName).distinct().forEach(System.out::println);

        System.out.println();
        //9. Get employee name whose employee id is greater than 102
        list.stream().filter(e -> e.getId() > 102).map(Employee::getName)
                .forEach(System.out::println);

        System.out.println();
        //10. Find an employee name whose age is less than 40
        list.stream().filter(e ->e.getAge() < 40).map(Employee::getName)
                .forEach(System.out::println);

        System.out.println();
        //11. Sum of square of array number
        int[] arr = {1,2,3,4,5,6};
        int sumOfSquare = Arrays.stream(arr).map(e->e*e).sum();
        System.out.println("Sum of square of array number: "+sumOfSquare);

        Integer[] arr7 = {1, 2, 3, 4, 5, 6};
        int sumOfSquares = Arrays.stream(arr7).mapToInt(a -> a * a).sum();
        // sum() works only on primitive streams
        //mapToInt() converts Integer → int

        System.out.println();
        //12. Sum of square of only even number
        int sumOfSquareOfEvenNumner = Arrays.stream(arr).filter(n->n%2 == 0).map(n->n*n).sum();
        System.out.println("Sum of square of only even number: "+sumOfSquareOfEvenNumner);

        System.out.println();
        //13. Display name start with 'S'
        list.stream().filter(e->e.getName().startsWith("S")).map(Employee::getName)
                .forEach(System.out::println);

        System.out.println();
        //14. Display name starts with 'A' and the age is greater than 40
        list.stream().filter(e->e.getName().startsWith("A") && e.getAge()>40)
                .map(Employee::getName).forEach(System.out::println);

        System.out.println();
        //15. Sort the array value and print in ascending order
        Integer[] array = {33,86,23,65,50};
        Arrays.stream(array).sorted().forEach(e-> System.out.print(e+" "));

        System.out.println();
        //16. Sort the array value print in descending order
        Arrays.stream(array).sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e+" "));

        System.out.println();
        //17. Find max value in arrays
        Optional<Integer> max = Arrays.stream(array).max(Integer::compareTo);
        max.ifPresent(m-> System.out.print("Maximum value: "+m));

        System.out.println();
        //18. Find min value in arrays
        Optional<Integer> min = Arrays.stream(array).min(Integer::compareTo);
        min.ifPresent(m-> System.out.print("Minimum value: "+m));

        System.out.println();
        //19. To find the First maximum number
        Optional<Integer> first = Arrays.stream(array).sorted(Comparator.reverseOrder()).findFirst();
        first.ifPresent(f-> System.out.print("First maximum value: "+f));

        System.out.println();
        //20. To find second maximum number
        Optional<Integer> secondMax = Arrays.stream(array).sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
        secondMax.ifPresent(f-> System.out.print("Second maximum value: "+f));

        System.out.println();
        //21. To find third maximum number
        Optional<Integer> thirdMax = Arrays.stream(array).sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst();
        thirdMax.ifPresent(fo-> System.out.print("Third maximum value: "+fo));

        System.out.println();
        //22. Find the first minimum number in arrays
        Optional<Integer> firstMin = Arrays.stream(array).sorted().findFirst();
        firstMin.ifPresent(fo-> System.out.print("First minimum value: "+fo));

        System.out.println();
        //23. Find the second minimum number in arrays
        Optional<Integer> secondMin = Arrays.stream(array).sorted().skip(1).findFirst();
        secondMin.ifPresent(fo-> System.out.print("Second minimum value: "+fo));

        System.out.println();
        //24. Find the third minimum number in arrays
        Optional<Integer> thirdMin = Arrays.stream(array).sorted().skip(2).findFirst();
        thirdMin.ifPresent(fo-> System.out.print("Third minimum value: "+fo));

        System.out.println();
        //25. Find a name whose length is greater than 5.
        List<String> list3 = list.stream().map(Employee::getName).filter(e -> e.length() > 5).toList();
        list3.forEach(System.out::println);

        System.out.println();
        //26. Find the occurrences of each character in string
        String string = "abcdca";
        LinkedHashMap<String, Long> collect = Arrays.stream(string.split("")).collect(Collectors.groupingBy(
                Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.forEach((k,v) -> System.out.println(k+" : "+v));


        System.out.println();
        //27. Find the first repeating character
        String key = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1).findFirst()
                .orElseThrow().getKey();
        System.out.println(key);

        System.out.println();
        //28. Find first Non-Repeating character
        String key1 = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1).findFirst()
                .orElseThrow().getKey();
        System.out.println(key1);

        System.out.println();
        //29. Find the occurrences of each word
        String[] word = {"radha", "shayam", "radha", "shayam", "lalbaboo", "abhimanyu" };
        LinkedHashMap<String, Long> collect1 = Arrays.stream(word)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect1.forEach((k,v) -> System.out.println(k+" : "+v));

        System.out.println();
        //30. Display a duplicate element with count
        Map<String, Long> collect2 = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        collect2.forEach((k,v) -> System.out.println(k+" : "+v));


        System.out.println();
        //31. Non-Duplicate element with count
        Map<String, Long> collect3 = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        collect3.forEach((k,v) -> System.out.println(k+" : "+v));

        System.out.println();
        //32. Find a duplicate element in string
        List<String> collect4 = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        collect4.forEach(e-> System.out.print(e+" "));

        System.out.println();
        //33. Find a distinct element in string
        Arrays.stream(string.split("")).distinct().forEach(e-> System.out.print(e+" "));

        System.out.println();
        //34. Find the longest string in a String array     //reduce() function is a terminal operation in streams used to combine elements into a single result.
        String[] stringArray = {"Java", "SpringBoot", "Microservices", "Spring", "Hibernate"};
        String long_s = Arrays.stream(stringArray).reduce((s1,s2)-> s1.length() > s2.length() ? s1 : s2).get();
        System.out.println(long_s);
        System.out.println(long_s.length());

        System.out.println();
        //35. Find the smallest string in a String array
        String smallestString = Arrays.stream(stringArray).reduce((s1,s2) -> s1.length() < s2.length() ? s1 : s2).get();
        System.out.println(smallestString);
        System.out.println(smallestString.length());

        System.out.println();
        //36. Write a program to find elements from arrays who start with 1.
        Integer[] arr1 = {45, 11, 34, 15, 24};
        Arrays.stream(arr1).map(s->s+"").filter(a->a.startsWith("1")).forEach(System.out::println);

        System.out.println();
        //37. String joiner example
        List<String> strings = Arrays.asList("Hello", "Lalbaboo", "Kumar");
        String res = String.join(" | ", strings);
        System.out.println(res);

        System.out.println();
        //38. Display fruits/brand and its count
        List<String> fruits = Arrays.asList("banana", "apple", "samsung", "motorola", "apple", "samsung");
        Map<String, Long> productDetails = fruits.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        productDetails.forEach((k,v)-> System.out.println(k+" - "+v));

        System.out.println();
        //39. Sort an employee based on salary if salary same then sort on based of name
        list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .collect(Collectors.toList()).forEach(System.out::println);


    }

}
