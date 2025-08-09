package Interview.Practice.JDK8Example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Jdk8EmployeeClassExample {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Lalbaboo", 28, 75000.0));
        empList.add(new Employee(102, "Deepak", 32, 150000.0));
        empList.add(new Employee(103, "Abhimanyu", 58, 75000.0));
        empList.add(new Employee(104, "Pritam", 14, 45000.0));
        empList.add(new Employee(105, "Raju", 50, 80000.0));
        empList.add(new Employee(106,"Sohan", 45, 52000.0));
        empList.add(new Employee(107,"Raj", 58, 74000.0));
        empList.add(new Employee(108, "Pritam", 14, 45000.0));

        // 1 Sort employee based on salary
        List<Employee> res = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(res);
        System.out.println();

        // 2 sort employee based on name
        empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
        System.out.println();

        // 3 count total number of employee
        long count = empList.stream().count();
        System.out.println("Count: "+count);
        System.out.println();

        // 4 count total number of employee based on department/name.
        empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));

        Map<String, Long> map = empList.stream().collect(Collectors.groupingBy(Employee::getName,  Collectors.counting()));
        System.out.println(map+" ");
        System.out.println();

        // 5. concatenate two list using flatmap
        List<Integer> list1 = Arrays.asList(2,3,5,6,4);
        List<Integer> list2 = Arrays.asList(13,18,12,15);
        List<List<Integer>> listVal = Arrays.asList(list1, list2);
        System.out.println(listVal);
        List<Integer> finalResult = listVal.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(finalResult);
        System.out.println();
        // stream of stream data want to convert in a single stream  -- FlatMap   // flatmap->mapping + Flattering (data transformation)
        //  map is mainly used to mapping the attribute id,name, salary out of them you want only name;
        //map->mapping field

        // 6. find avg,max,min,sum,count salary of employee

        //Optional<Employee> max = empList.stream().max(Comparator.comparing(Employee::getSalary));
        double max1 = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMax();
        System.out.println("Max: "+max1);
        double min = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMin();
        System.out.println("Min: "+min);
        double avg = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getAverage();
        System.out.println("Average: "+avg);
        double sum = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getSum();
        System.out.println("Sum: "+sum);
        double count1 = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getCount();
        System.out.println("Count: "+count1);

        // 7. find the name of all employee
        empList.stream().map(Employee::getName).forEach(System.out::println);
        System.out.println();

        // 8. find distinct name of employee
        empList.stream().map(Employee::getName).distinct().forEach(System.out::println);
        System.out.println();

        // 9. Get employee name whose employee id is greater than 102
        empList.stream().filter(e->e.getId() > 102).map(Employee::getName).forEach(System.out::println);
        System.out.println();

        // 10. find employee name whose age is less than 40
        empList.stream().filter(e->e.getAge() < 40).map(Employee::getName).forEach(System.out::println);
        System.out.println();

        // 11. sum of square no of number
        List<Integer> square = Arrays.asList(2,3,4,5);
        int ans = square.stream().map(n->n*n).reduce(Integer::sum).get();
        System.out.println("Sum of square: "+ans);

        // 12. sum of square of only even number
        List<Integer> squar1 = Arrays.asList(2,3,4,5,6,7,8);
        int ans2 = squar1.stream().filter(n->n%2 == 0).map(n->n*n).reduce(Integer::sum).get();
        System.out.println("Sum of square on even number: "+ans2);

        // 13. Display name start with 'S'
        empList.stream().filter(e->e.getName().startsWith("S")).map(Employee::getName).forEach(System.out::println);

        // 14. display name start with 'A' and age is greater than 40
        empList.stream().filter(e->e.getName().startsWith("A") && e.getAge() > 40).map(Employee::getName).forEach(System.out::println);

        // 15. sort the array value and print in ascending order
        List<Integer> arr = Arrays.asList(10,45,15,40,30,20,25,35);
        arr.stream().sorted().forEach(e->System.out.print(" "+e));  //forEach(System.out::println);
        System.out.println();

        // 16. sort the array value print in descending order
        arr.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(" "+e));//forEach(System.out::println);
        System.out.println();

        // 17. find max value in array
        int maxValue = arr.stream().max(Integer::compare).get();
        System.out.println("Max value from array: "+maxValue);

        // 18. find min value in array
        int minValue = arr.stream().min(Integer::compare).get();
        System.out.println("Min value from array: "+minValue);

        // 19. To find First maximum number
        int firstMax = arr.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Find first maximum number: "+firstMax);

        // 20. To find second maximum number
        int secondMax = arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Find second maximum number: "+secondMax);

        // 21. To find third maximum number
        int thirdMax = arr.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println("Find third maximum number: "+thirdMax);

        // 22. Find first minimum number in array
        int firstMin = arr.stream().sorted(Comparator.reverseOrder()).skip(arr.toArray().length-1).findFirst().get();
        System.out.println("Find first minimum number: "+firstMin);

        // 23. Find second minimum number in array
        int secondMin = arr.stream().sorted(Comparator.reverseOrder()).skip(arr.toArray().length-2).findFirst().get();
        System.out.println("Find first minimum number: "+secondMin);

        // 24. Find third minimum number in array
        int thirdMin = arr.stream().sorted(Comparator.reverseOrder()).skip(arr.toArray().length-3).findFirst().get();
        System.out.println("Find first minimum number: "+thirdMin);

        //25. Find name whose length is greter than 5.
        System.out.println("**********************************");
        empList.stream().map(Employee::getName).filter(name -> name.length() > 5).forEach(e->System.out.println(e+" "));

        // 26. Find occurrences of each character in string
        String str1 = "India";

        Map<String, Long> occurances = Arrays.stream(str1.split("")).map(String ::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        occurances.forEach((k,v) -> System.out.println(k+" occurrences "+v+" times"));

        System.out.println(occurances);

        // 27. Find first repeating character

        Optional<String> map_val = Arrays.stream(str1.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();

        map_val.ifPresent(val -> System.out.println("First repeating character: " + val));

        // 28. Find first Non-Repeating character

        Optional<String> non_repeating = Arrays.stream(str1.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        non_repeating.ifPresent(System.out::println);
        non_repeating.ifPresent(c -> System.out.println("First non-repeating character: "+c));

        // 29. Find occurrences of each word

        String[] word = {"Abhi", "Pritam", "Abhi", "Ashish", "Pritam", "Lalbaboo"};

        Map<String, Long> occurr = Arrays.stream(word).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        occurr.forEach((k,v) -> System.out.println(k+" occurrences "+v+" times"));

        // 30. Display a duplicate element with count

        String string = "displayduplicate";

        Map<String, Long> dup = Arrays.stream(string.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        // dup.forEach((k,v) -> System.out.println(k+" occurrences "+v+" times"));

        System.out.println(dup);

        // 31. Non-Duplicate element with count

        Map<String, Long> non_dup = Arrays.stream(string.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(non_dup);

        // 32. Find duplicate element in string

        List<String> duplicate_string = Arrays.stream(string.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() > 1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicate_string);

        // 33. Find distinct element in string

        List<String> distinct = Arrays.stream(string.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() == 1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(distinct);

        // 34. Find the longest string in a String array

        String[] longStr = {"Java", "SpringBoot", "Microservices", "Spring", "Hibernate"};
        String long_str = Arrays.stream(longStr).reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2).get();
        System.out.println(long_str);
        System.out.println(long_str.length());

        // 35. Find the smallest string in a String array

        String[] smallStr = {"Java", "SpringBoot", "Microservices", "Spring", "Hibernate"};
        String small_str = Arrays.stream(smallStr).reduce((s1,s2) -> s1.length() < s2.length() ? s1 : s2).get();
        System.out.println(small_str);
        System.out.println(small_str.length());

        // 36. Java program to all elements from array who start with 1.

        int[] num = {40, 23, 11, 87, 16, 88, 13};
        IntStream.of(num).boxed().map(s->s+"").filter(s->s.startsWith("1")).forEach(s-> System.out.print(s+" "));

        // 37. String joiner example

        System.out.println();
        List<String> strings = Arrays.asList("deepak", "mca", "java");
        String result = String.join(" | ", strings);
        System.out.println(result);

        //38. Display fruits/brand and its count
        List<String> prodList = Arrays.asList("apple", "samsung", "motorola", "apple", "samsung");
        Map<String, Long> productDetails = prodList.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(productDetails);


    }
}
