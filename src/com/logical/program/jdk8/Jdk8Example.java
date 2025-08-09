package com.logical.program.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Jdk8Example {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "deepak", 27, 45000));
		empList.add(new Employee(105, "manjit", 29, 45000));
		empList.add(new Employee(102, "ashis", 45, 25000));
		empList.add(new Employee(104, "sanish", 30, 8000));
		empList.add(new Employee(103, "bibu", 32, 40000));
		empList.add(new Employee(108, "animesh", 43, 95000));
		

		// 1 Sort employee based on salary
		empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);

		// 2 sort employee based on name
		System.out.println();

		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);

		// 3count total number of employee
		System.out.println();
		long count = empList.stream().count();
		System.out.println("count" + count);

		// 3 count total number of employee based on department.

		System.out.println();
		Map<String, Long> mapval = empList.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println(mapval);

		// 4.concate two list using flatmap
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9);
		List<List<Integer>> listval = Arrays.asList(list1, list2);
		List<Integer> finalResult = listval.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(finalResult);

		// 5.find avg,max,min,sum,count salary of employee
		double max = empList.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getMax();
		double min = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMin();
		double sum = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getSum();
		double avg = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getAverage();
		double cnt = empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getCount();
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(cnt);

		// 6.find the name of all employee
		System.out.println();
		empList.stream().map(Employee::getName).forEach(System.out::println);

		// 7 find distinct name of employee
		System.out.println("======");
		empList.stream().map(Employee::getName).distinct().forEach(System.out::println);

		// 8.get employee name whose employee id is greater than 102
		System.out.println("************");
		empList.stream().filter(emp -> emp.getId() > 102).map(Employee::getName).forEach(System.out::println);

		// 9.find employee name whose age is less than 40

		System.out.println("*************");
		empList.stream().filter(e -> e.getAge() > 40).map(Employee::getName).forEach(System.out::println);

		// 10.sum of squre of array number
		
		System.out.println("====");
		int arr[] = { 1, 2, 3, 4, 5 };
		// IntStream.of(arr).map(n->n*n).reduce(Integer::sum).getAsInt();
		int sum_all = Arrays.stream(arr).map(n -> n * n).reduce(Integer::sum).getAsInt();
		System.out.println(sum_all);

		// 11.sum of squre of only even number
		System.out.println("+++++++++++++");
		int arr1[] = { 1, 2, 3, 4, 5 };
		// IntStream.of(arr[1]).filter(n->(n%2==0)).map(n->(n*n)).reduce(Integer::sum);
		int sumof_suere = Arrays.stream(arr1).filter(n -> (n % 2 == 0)).map(n -> (n * n)).reduce(Integer::sum)
				.getAsInt();
		System.out.println(sumof_suere);

		// 12.Display name start with s
		System.out.println("$$$$$$$$$$$$$");
		empList.stream().filter(e -> e.getName().startsWith("s")).map(Employee::getName).forEach(System.out::println);

		// 13 display name start with 'a' and age is greater than 40
		System.out.println("********************");
		empList.stream().filter(emp -> emp.getName().startsWith("a") && emp.getAge() > 40).map(Employee::getName)
				.forEach(System.out::println);

		// 14.sort the array value and print in ascending order

		int arr3[] = { 34, 56, 77, 32, 67 };
		// IntStream.of(arr3).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		Arrays.stream(arr3).sorted().forEach(System.out::print);
		// or
		System.out.println();
		Arrays.stream(arr3).sorted().forEach(e -> System.out.print(e + " "));

		// 15 sort the array value print in descending order
		System.out.println("===========");
		int arr4[] = { 32, 56, 47, 88, 11 };
		// IntStream.of(arr4).boxed().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+"
		// "));
		Arrays.stream(arr4).boxed().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));

		// 16 find max value in array
		System.out.println();
		int arr5[] = { 34, 56, 7, 8, 80, 12, 14 };
		int maxval = IntStream.of(arr5).max().getAsInt();
		System.out.println("maxval: " + maxval);

		// 17 find min value in array

		int arr6[] = { 45, 36, 11, 10, 55 };
		int minval = IntStream.of(arr6).min().getAsInt();
		System.out.println(minval);

		// 2(method)18 To find  maximum number
		int arr11[] = { 14, 67, 89, 34, 44 };
		int first_max1 = IntStream.of(arr11).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(first_max1);

		// 19 To find second maximum number
		int second_max = IntStream.of(arr11).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(second_max);

		// 20 to find third maximum number in array
		Integer third_max_number = IntStream.of(arr11).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst()
				.get().intValue();
		System.out.println(third_max_number);

		// 21 find first minimum number in array.
		Integer first_min_element = IntStream.of(arr11).boxed().sorted(Comparator.reverseOrder()).skip(arr.length - 1)
				.findFirst().get();
		System.out.println(first_min_element);

		// 22 find second minimum number in array.
		Integer second_min_element = IntStream.of(arr11).boxed().sorted(Comparator.reverseOrder()).skip(arr.length - 2)
				.findFirst().get();
		System.out.println(second_min_element);

		// 23 find third minimum number in array.
		Integer third_min_element = IntStream.of(arr11).boxed().sorted(Comparator.reverseOrder()).skip(arr.length - 3)
				.findFirst().get();
		System.out.println(third_min_element);

		// 24 find name whose length is greater than 5
		System.out.println("**************");
		empList.stream().filter(e -> e.getName().length() > 5).map(Employee::getName)
				.forEach(e -> System.out.println(e + " "));

		// 25 find occurences of each character in string
		String str = "ilovemyindiammoo";
		Map<String, Long> map_val = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(map_val);

		// 26 find first Repeating character 
		String str1 = "indfirstrepeatingcharfind";
		String key1 = Arrays.stream(str1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(p -> p.getValue() > 1).findFirst().get().getKey();
		System.out.println(key1);

		// 27 find first nonRepeating charcter
		String str6 = "alliswellai";
		String key2 = Arrays.stream(str6.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(p -> p.getValue() == 1).findFirst().get().getKey();
		System.out.println(key2);

		// 28 Find occurences of each word using stream api

		String word[] = { "deepak", "ashish", "deepak", "deepak", "nehal", "ashish", "rupal" };
		Map<String, Long> name_count = Arrays.stream(word)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(name_count);

		// 29 Display duplicate element with count
		String str7 = "displayduplicate";   
		Map<Object, Object> duplicat_key = Arrays.stream(str7.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(duplicat_key);

		// 30 non-duplicate elemnt with count in string

		String str8 = "displayduplicate";
		Map<Object, Object> non_duplicat_key = Arrays.stream(str8.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(non_duplicat_key);

		// 31 find duplicate element in string
		System.out.println("dupli");
		String str9 = "displayduplicate";
		List<Object> dupli = Arrays.stream(str9.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(dupli);

		// 32 find distinct element in string
		String str10 = "displayduplicate";
		List<Object> distict = Arrays.stream(str9.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());

		System.out.println(distict);
		
		//33. find  longest String in String array
		
		String []longstr= {"java","springboot","microservices","spring","hibernate"};
		String longest_string=Arrays.stream(longstr).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
		System.out.println(longest_string);
		System.out.println(longest_string.length());
		
		//34. find  smallest String in String array
		String smallest_sting=Arrays.stream(longstr).reduce((s1,s2)->s1.length()<s2.length()?s1:s2).get();
		System.out.println(smallest_sting);
		System.out.println(smallest_sting.length());
		
		//35.Java program to all elemnts from array who start with1
		
		int num[]= {40,23,11,87,16,88,13};
		IntStream.of(num).boxed().map(s->s+"").filter(s->s.startsWith("1")).forEach(s->System.out.print(s+" "));
		
		//36 String Joiner example
		String strop[]= {"raj","karan","bips"};
		System.out.println();
		List<String>stringjoiner=Arrays.asList("deepak","mca","java");
		String result=String.join("|", stringjoiner);
		System.out.println(result);
		String result1=String.join("|", strop);
		System.out.println("stop"+result1);
		 
		//37 Display fruits/brand and its count
		
		List<String>prodList=Arrays.asList("apple","samsung","motorola","apple","samsung");
	    Map<String,Long>prodDetails=prodList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    System.out.println(prodDetails);
	    
	    //list of integer fourth largest even number
	    List<Integer>list =Arrays.asList(12,15,68,44,22,90,91,78,30);
		Integer val= list.stream().filter(p->p%2==0).sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
		System.out.println(val);
		
		//sort employee based on salary if salary same then sort on based of name
		Stream<Employee> stream=empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		List<Employee>test=stream.collect(Collectors.toList());
		System.out.println(test);
				 
		
		
		

	}

}
