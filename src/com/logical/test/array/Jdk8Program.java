  package com.logical.test.array;
//only duplicate countes need to print
//shift all 1 to begining in array

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

import com.logical.program.jdk8.Employee;

public class Jdk8Program
{
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "deepak", 27, 45000));
		empList.add(new Employee(105, "manjit", 29, 45000));
		empList.add(new Employee(102, "ashis", 45, 25000));
		empList.add(new Employee(104, "sanish", 30, 8000));
		empList.add(new Employee(103, "bibu", 32, 40000));
		empList.add(new Employee(108, "animesh", 43, 95000));
		// 1 Sort employee based on salary
		//empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);
		//empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
		//long l=empList.stream().count();
		//System.out.println(l);
		/*Map<String, Long> mapval = empList.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println(mapval);*/
		/*List<Integer>list1=Arrays.asList(1,2,3,4,5);
		List<Integer>list2=Arrays.asList(6,7,8,9,10);
		List<List<Integer>>listg=Arrays.asList(list1,list2);
		List<Integer>listval=listg.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(listval);*/
		/*double max=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMax();
		double min=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMin();
		double avg=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getAverage();
		double cnt=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getCount();
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
		System.out.println((int)cnt);*/
		//empList.stream().map(emp->emp.getName()).forEach(e->System.out.print(e+" "));
		//empList.stream().map(Employee::getName).distinct().forEach(e->System.out.print(e+" "));
		//empList.stream().filter(p->p.getId()>102).map(Employee::getName).forEach(e->System.out.print(e+ " "));
		//empList.stream().filter(p->p.getAge()<40).map(Employee::getName).forEach(e->System.out.print(e+ " "));
		
		/*int arr[] = { 11, 2, 34, 41, 5 };
		int f=IntStream.of(arr).max().getAsInt();
		int s=IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(s);*/
		
		/*int arr[] = { 1, 2, 4, 3, 5 };
		int sum=IntStream.of(arr).map(n->n*n).reduce(Integer::sum).getAsInt();
		System.out.println(sum);*/
		/*int arr[] = { 1, 2, 4, 3, 5 };
		int sd=IntStream.of(arr).filter(p->(p%2==0)).map(n->n*n).reduce(Integer::sum).getAsInt();
		System.out.println(sd);*/
		//empList.stream().filter(e->e.getName().startsWith("s")).map(Employee::getName).forEach(System.out::print);
		//empList.stream().filter(e->e.getName().startsWith("s")&&e.getAge()>29).map(Employee::getName).forEach(System.out::print);
		
		/*int arr[] = { 11, 21, 44, 13, 52 };
		IntStream.of(arr).sorted().forEach(e->System.out.print(e+" "));*/
		/*int arr[] = { 11, 21, 44, 13, 52 };
		IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));*/
		
		int arr[] = { 11, 21, 44, 13, 52 };
		/*int max1=IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max1);*/
		/*int s=IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).skip(arr.length-1).findFirst().get();
		System.out.println(s);*/
		/*int thi=IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(thi);*/
		/*int ths=IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).skip(arr.length-3).findFirst().get();
		System.out.println(ths);*/
		//empList.stream().filter(p->p.getName().length()>5).map(Employee::getName).forEach(e->System.out.print(e+" "));
		/*String str="heloow india";
		Map<String,Long>cv=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(cv);*/
		String str1 = "indachjkkmm";
		/*String key1 = Arrays.stream(str1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(p -> p.getValue() > 1).findFirst().get().getKey();
		System.out.println(key1);*/
		
		/*String key1 = Arrays.stream(str1.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(p -> p.getValue() == 1).findFirst().get().getKey();
System.out.println(key1);*/
		
		/*String word[] = { "deepak", "ashish", "deepak", "deepak", "nehal", "ashish", "rupal" };
		Map<String,Long>map=Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);*/
		//Display duplicate element with count
		/*Map<Object, Object>v2=Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(p->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(v2);*/
		
		/*Map<Object, Object>v2=Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().filter(p->p.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				System.out.println(v2);*/
		
		     /*List<String>v2=Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().filter(p->p.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
				System.out.println(v2);*/
		
		/*List<String>v2=Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(p->p.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
		System.out.println(v2);*/
		//find second longest need to write
		/*String secondLongest = Arrays.stream(longstr)
			    .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
			    .skip(1)
			    .findFirst()
			    .get();*/
		
		/*String []longstr= {"java","springboot","microservices","spring","hibernate"};
		String longest=Arrays.stream(longstr).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
		int e=Arrays.stream(longstr).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get().length();
		System.out.println(longest);
		System.out.println(e);*/
		//find second smallest need to write
		/*String secondSmallest = Arrays.stream(longstr)
			    .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
			    .skip(1)
			    .findFirst()
			    .get();*/
		/*String small=Arrays.stream(longstr).reduce((s1,s2)->s1.length()<s2.length()?s1:s2).get();
		int am=Arrays.stream(longstr).reduce((s1,s2)->s1.length()<s2.length()?s1:s2).get().length();
		System.out.println(small);
		System.out.println(am);*/
		/*int num[]= {40,23,11,87,16,88,13};
		IntStream.of(num).boxed().map(s->s+"").filter(s->s.startsWith("1")).forEach(e->System.out.print(e+" "));*/
		/*String strop[]= {"raj","karan","bips"};
		String s1=String.join("-", strop);
		System.out.println(s1);
		List<String>list=Arrays.asList("deepak","mca","java");
		String f=String.join("|", list);
		System.out.println(f);
		
		List<String>prodList=Arrays.asList("apple","samsung","motorola","apple","samsung");
		Map<String,Long>val=prodList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(val);*/
		/* List<Integer>list =Arrays.asList(12,15,68,44,22,90,91,78,30);
		int fourth_largest= list.stream().filter(p->(p%2==0)).sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
		System.out.println(fourth_largest);*/
		//sort employee based on salary if salary same then sort on based of name
		/*Stream<Employee>emp=empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		List<Employee>output=emp.collect(Collectors.toList());
		System.out.println(output);*/
}
}
