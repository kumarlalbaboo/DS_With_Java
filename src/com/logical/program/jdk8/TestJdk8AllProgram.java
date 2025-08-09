package com.logical.program.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestJdk8AllProgram
{
	public static void main(String[] args)
	{
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "deepak", 27, 45000));
		empList.add(new Employee(105, "deepak", 29, 5000));
		empList.add(new Employee(102, "ashis", 45, 25000));
		empList.add(new Employee(104, "sanish", 30, 8000));
		empList.add(new Employee(103, "bibu", 32, 40000));
		empList.add(new Employee(108, "animesh", 43, 95000));
		
		//1. Sort employee based on salary
		
		empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);
		
		//2. sort employee based on name
		
		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
		
		//3.count total number of employee
		System.out.println();
		long count=empList.stream().count();
		System.out.println(count);
		
		//4. count total number of employee based on name.
		Map<String,Long>count_name=empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(count_name);
		
		//4.Concate two list using flatmap
		
	     List<String>list1=Arrays.asList("deepak","raj","sring");
	     List<String>list2=Arrays.asList("sahil","mani","java");
	     List<List<String>>finalList= Arrays.asList(list1,list2);
	     List<String>output=finalList.stream().flatMap(e->e.stream()).collect(Collectors.toList());
	     System.out.println(output);
	     
	    //5.find avg,max,min,sum,count salary of employee
	    double max_sal=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMax();
	    System.out.println(max_sal);
	    double min_sal=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMin();
	    System.out.println(min_sal);
	    double avg_sal=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getAverage();
	    System.out.println(avg_sal);
	    double sum_sal=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getSum();
	    System.out.println(sum_sal);
	    double count_sal=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getCount();
	    System.out.println((int)count_sal);
	    
	   //6.find the name of all employee
	    empList.stream().map(e->e.getName()).forEach(e->System.out.print(e+" "));
	    
	    
	   //7. find distinct name of employee
	    System.out.println();
	    empList.stream().map(e->e.getName()).distinct().forEach(e->System.out.print(e+" "));
	    
	   //8.get employee name whose employee id is greater than 102
	    System.out.println();
	    empList.stream().filter(p->p.getId()>102).map(Employee::getName).forEach(p->System.out.print(p+" "));
	    
	  //9.find employee name whose age is less than 40
	    System.out.println();
	    empList.stream().filter(e->e.getAge()>40).map(Employee::getName).forEach(e->System.out.print(e+" "));
	    
	  // 10.sum of squre no of number
	     System.out.println();
	     int arr[]= {1,2,3,4,5};
	     int sum_all=IntStream.of(arr).map(n->n*n).reduce(Integer::sum).getAsInt();
	     System.out.println("sum_all:= "+sum_all);
	     
	  // 11.sum of squre of only even number
	     System.out.println();
	     int arr1[]= {1,2,3,4,5,6};
	    int even_sum= IntStream.of(arr1).filter(e->(e%2==0)).map(e->(e*e)).reduce(Integer::sum).getAsInt();
	    System.out.println("even sum: "+even_sum);
	    
	    //12.Display name start with s
	    System.out.println();
	    empList.stream().filter(emp->emp.getName().startsWith("s")).map(Employee::getName).forEach(e->System.out.print(e+" "));
	    
	 // 13 display name start with 'a' and age is greater than 40
	    System.out.println();
	    empList.stream().filter(p->p.getName().startsWith("a")&&p.getAge()>40).map(Employee::getName).forEach(e->System.out.print(e+" "));
	    
	 // 14.sort the array value and print in ascending order
	    System.out.println();
	    int arr3[]= {12,56,78,93,14};
	    IntStream.of(arr3).sorted().forEach(e->System.out.print(e+" "));
	    
	 // 15 sort the array value print in descending order
	    System.out.println();
	    int arr4[]= {13,45,67,10,33};
	    IntStream.of(arr4).boxed().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
	  
	 // 16 find max value in array
	    System.out.println();
	    int arr5[]= {13,45,34,47,7};
	    int max=IntStream.of(arr5).max().getAsInt();
	    System.out.println("max:="+max);
	    
	 // 17 find min value in array
	    System.out.println();
	    int arr6[]= {45,68,23,89,65};
	    int min=IntStream.of(arr6).min().getAsInt();
	    System.out.print("min:"+min);
		
	 //2(method)18. To find  maximum number
	    System.out.println();
	    int arr7[]= {13,26,27,90,34};
	    int max1= IntStream.of(arr7).boxed().sorted(Comparator.reverseOrder()).findFirst().get().intValue();
	    System.out.println(max1);
	    
	 // 19 To find second maximum number
	    System.out.println();
	    int arr8[]= {12,56,47,38,96};
	    int second_max=IntStream.of(arr8).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get().intValue();
	    System.out.println(second_max);
	    
	 // 20 to find third maximum number in array
	    
	    int arr9[]= {67,54,34,55,70};
	   int third_max= IntStream.of(arr9).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get().intValue();
	   System.out.println(third_max);
	   
	// 21 find first minimum number in array.
	   System.out.println();
	   int arr10[]= {78,45,44,88,77};
	   int first_min= IntStream.of(arr10).boxed().sorted().findFirst().get().intValue();
	   System.out.println(first_min);
	   
	// 22 find second minimum number in array.
	   System.out.println();
	   int arr11[]= {34,15,18,45,67};
	   int sec_max=IntStream.of(arr11).boxed().sorted().skip(1).findFirst().get().intValue();
	   System.out.println(sec_max);
	   
	// 23 find third minimum number in array.
	   System.out.println();
	   int arr12[]= {34,15,18,45,67};
	   int third_maximum=IntStream.of(arr12).boxed().sorted().skip(2).findFirst().get().intValue();
	   System.out.println(third_maximum);
	   
	// 24 find name whose length is greater than 5
	   String names[]= {"aki","manisha","akashdeep","anu"};
	   Arrays.stream(names).filter(name->name.length()>5).map(name->name).forEach(e->System.out.print(e+" "));
	  
	// 25 find occurences of each character in string
	   System.out.println();
	   String str45="findoccurences";
	   Map<String,Long>mapval=Arrays.stream(str45.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	   System.out.println(mapval);
	   
	// 26 find first Repeating character
	   String str46="findoccurences";
	   String first_nonrepeat= Arrays.stream(str46.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).findFirst().get().getKey();
	   System.out.println(first_nonrepeat);
	   
	// 27 find first nonRepeating charcter
	   String str47="findoccurencesif";
	   String non_repeated=Arrays.stream(str47.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).findFirst().get().getKey();
	   System.out.println(non_repeated);
	   
	// 28 Find occurences of each word using stream api
	   String word[] = { "deepak", "ashish", "deepak", "deepak", "nehal", "ashish", "rupal" };
	   Map<String,Long>name_cnt= Arrays.asList(word).stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	   System.out.println(name_cnt);
	   
	// 29 Display duplicate element with count
	   String str48="findoccurencesif";
	   Map<Object,Object>map_count=Arrays.stream(str48.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	   System.out.println(map_count);
	   
	// 30 Display non-duplicate element with count
	   String str49="findoccurencesif";
	   Map<Object,Object>map_count2=Arrays.stream(str49.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	   System.out.println(map_count2);
	}
	
	

}
