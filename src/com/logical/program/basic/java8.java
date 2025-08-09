package com.logical.program.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.logical.program.jdk8.Employee;

public class java8
{
	// 1 Sort employee based on salary
	// 2 sort employee based on name
	// 3count total number of employee
	// 4 count total number of employee based on name
	// 5.concate two list using flatmap
	// 6.find avg,max,min,sum,count salary of employee
	// 7.find the name of all employee
	// 8 find distinct name of employee
	// 9.get employee name whose employee id is greater than 102
	// 10.find employee name whose age is less than 40
	// 10.sum of squre of array number
	// 11.sum of squre of only even number
	// 12.Display name start with s
	// 13 display name start with 'a' and age is greater than 40
	// 14.sort the array value and print in ascending order
	// 15 sort the array value print in descending order
	// 16 find max value in array
	// 17 find min value in array
	// 2(method)18 To find  maximum number
	// 19 To find second maximum number
	// 20 to find third maximum number in array
	// 21 find first minimum number in array.
	// 22 find second minimum number in array.
	// 23 find third minimum number in array.
	// 24 find name whose length is greater than 5
	// 25 find occurences of each character in string
	// 26 find first Repeating character
	// 27 find first nonRepeating charcter
	// 28 Find occurences of each word using stream api
	// 29 Display duplicate element with count
	// 30 non-duplicate elemnt with count in string
	// 31 find duplicate element in string
	// 32 find distinct element in string
	//33. find  longest String in String array
	//34. find  smallest String in String array
	//35.Java program to all elemnts from array who start with1
	//36 String Joiner example
	//37 Display fruits/brand and its count
	//list of integer fourth largest even number
	//checck number is prime or not
	//list out prime number from array
	//count occurences of each number
	//remove dulicate elemt
	//factorial using recursion
	//find second smallest
	//find second larrgest
	//mobile dynamic
	//remove duplicate value from array
	//reverse number on same place
	//shift all zero in begining ,last with 1 and other number combination
	//sort in asceding order
	//sort in descending order
	//sort name in string array
	//find total wrod
	//find uniue character in string
	//count small and capital charcater individually
	//find character and its count
	//binary search using recursion and simple
	//different sorting
	//linked list op create,addhead,countnodes,add tail,add middle.
	//SL
	//implement stack
	//implement ueue
	//remove element from arraylist without use another arraylist
	//how to fetch student as key and other as value from map
	//default method access
	//static method access
	//write of lambda expression
	//sorting

	public static void main(String[] args) 
	{
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "deepak", 27, 45000));
		empList.add(new Employee(105, "manjit", 29, 45000));
		empList.add(new Employee(102, "ashis", 45, 25000));
		empList.add(new Employee(104, "sanish", 30, 8000));
		empList.add(new Employee(103, "animesh", 32, 40000));
		empList.add(new Employee(108, "animesh", 43, 95000));
		
		// 1 Sort employee based on salary	
		//empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);
		// 2 sort employee based on name
		//empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
		
		// 3count total number of employee
		long l=empList.stream().count();
		System.out.println(l);
		// 4 count total number of employee based on name
		Map<String,Long>cnt=empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(cnt);
		
		// 5.concate two list using flatmap
		List<Integer>l1=Arrays.asList(1,2,3,4,5);
		List<Integer>l2=Arrays.asList(6,7,8,9,10);
		List<List<Integer>>al=Arrays.asList(l1,l2);
		List<Integer>result=al.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(result);
		// 6.find avg,max,min,sum,count salary of employee
		double max=empList.stream().mapToDouble(Employee::getSalary).summaryStatistics().getMax();
		System.out.println(max);
		// 7.find the name of all employee
		empList.stream().map(Employee::getName).forEach(e->System.out.print(e+" "));
		// 8 find distinct name of employee
		System.out.println();
		empList.stream().map(Employee::getName).distinct().forEach(e->System.out.print(e+" "));
		// 9.get employee name whose employee id is greater than 102
		System.out.println();
		empList.stream().filter(p->p.getId()>102).map(Employee::getName).forEach(e->System.out.print(e+" "));
		// 10.find employee name whose age is less than 40
		System.out.println();
		empList.stream().filter(p->p.getAge()>40).map(Employee::getName).forEach(e->System.out.print(e+" "));
		// 10.sum of squre of array number
		int arr[]= {1,2,3,4,5};
		int i=IntStream.of(arr).map(n->n*n).reduce(Integer::sum).getAsInt();
		System.out.print(i);
		// 11.sum of squre of only even number
		int io=IntStream.of(arr).filter(p->(p%2==0)).map(p->p*p).reduce(Integer::sum).getAsInt();
		System.out.println(io);
		// 12.Display name start with s
		System.out.println();
		empList.stream().filter(e->e.getName().startsWith("s")).forEach(e->System.out.print(e+" "));
		// 13 display name start with 'a' and age is greater than 40
		System.out.println();
		empList.stream().filter(e->e.getName().startsWith("a")&&e.getAge()>40).forEach(e->System.out.print(e+" "));
		// 14.sort the array value and print in ascending order
		System.out.println();
		int arr1[]= {21,42,63,41,55};
		IntStream.of(arr1).sorted().forEach(e->System.out.print(e+" "));
		// 15 sort the array value print in descending order
		System.out.println();
		IntStream.of(arr1).boxed().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
		// 16 find max value in array
		int i12=IntStream.of(arr1).max().getAsInt();
		System.out.println(i12);
		// 17 find min value in array
		int i13=IntStream.of(arr1).min().getAsInt();
		// 2(method)18 To find  maximum number
		System.out.println("=");
		int maxu=IntStream.of(arr1).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(maxu);
		// 19 To find second maximum number
		int maxu1=IntStream.of(arr1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(maxu1);
		// 20 to find third maximum number in array
		int maxu2=IntStream.of(arr1).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(maxu2);
		// 21 find first minimum number in array.
		System.out.println("=====");
		int y=IntStream.of(arr1).sorted().min().getAsInt();
		System.out.println(y);
		// 22 find second minimum number in array.
		System.out.println("=====");
		int y1=IntStream.of(arr1).sorted().skip(1).min().getAsInt();
		System.out.println(y1);
		// 23 find third minimum number in array.
		System.out.println("=====");
		int y2=IntStream.of(arr1).sorted().skip(2).min().getAsInt();
		System.out.println(y2);
		// 24 find name whose length is greater than 5
		System.out.println("-----------------");
		empList.stream().filter(p->p.getName().length()>5).map(Employee::getName).forEach(e->System.out.print(e+" "));
		// 25 find occurences of each character in string
		  String str="arshdeepindia";
		 Map<String,Long>count= Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(count);
		// 26 find first Repeating character
		 String str1="rshdeepindia";
		String s= Arrays.stream(str1.split("")).
		 collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		 .entrySet().stream().filter(p->p.getValue()>1).findFirst().get().getKey();
		System.out.println(s);
		// 27 find first nonRepeating charcter=
		String s2= Arrays.stream(str1.split("")).
				 collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				 .entrySet().stream().filter(p->p.getValue()==1).findFirst().get().getKey();
				System.out.println(s2);
		// 28 Find occurences of each word using stream api
				String str3[]= {"ram","shyam","shyam","java","ram","ram"};
			Map<String,Long>put=Arrays.stream(str3).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
			System.out.println(put);
		// 29 Display integer element with count without jdk8
			System.out.println("duplicate");
			Integer arrs[]= {12,45,67,54,32,11,45,67,67};
			Map<Integer,Integer>map=new LinkedHashMap<Integer, Integer>();
			for(Integer num:arrs)
			{
				map.put(num, map.getOrDefault(num, 0)+1);
			}
			for(Map.Entry<Integer, Integer>entry:map.entrySet())
			{
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
			
			
		// 30 Display duplicate integer element with count without jdk8
			System.out.println();
			System.out.println("duplicate");
			Integer arrs1[]= {12,45,67,54,32,11,45,67,67};
			Map<Integer,Integer>map1=new LinkedHashMap<Integer, Integer>();
			for(Integer num:arrs1)
			{
				map1.put(num, map1.getOrDefault(num, 0)+1);
			}
			for(Map.Entry<Integer, Integer>entry:map1.entrySet())
			{
				if(entry.getValue()>1)//==1
				{
				System.out.println(entry.getKey()+"->"+entry.getValue());
				}
			}
			
			// 29 Display  duplicate integer element with count with jdk8
			System.out.println("======================");
		Map<Object,Object>find=	Arrays.stream(arrs).
			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().filter(p->p.getValue()>1)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(find);
		
		// 29 Display  only integer element with count with jdk8
					System.out.println("======================");
				Map<Object,Object>find1=	Arrays.stream(arrs).
					collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					.entrySet().stream()
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				System.out.println(find1);
				
		// 29 duplicate element with count in string
			String str12="kalyani";
			Map<Object,Object>kl=	
				Arrays.stream(str12.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
				.filter(p->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			System.out.println(kl);
			
		// 30 non-duplicate element with count in string
			Map<Object,Object>k2=	
					Arrays.stream(str12.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
					.filter(p->p.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				System.out.println(k2);
		// 31 find duplicate element in string
				String str10 = "displayduplicate";
				List<Object> dupli = Arrays.stream(str12.split(""))
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
						.filter(p -> p.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());

				System.out.println(dupli);
		// 32 find distinct element in string
				
				List<Object> distict = Arrays.stream(str12.split(""))
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
						.filter(p -> p.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());

				System.out.println(distict);
		//33. find  longest String in String array
		String []longstr= {"java","springboot","microservices","spring","hibernate"};
		String check=Arrays.stream(longstr).reduce((e1,e2)->e1.length()>e2.length()?e1:e2).get();
		System.out.println(check);
		//34. find  smallest String in String array
		String []longstr1= {"java","springboot","microservices","spring","hibernate"};
		String check1=Arrays.stream(longstr1).reduce((e1,e2)->e1.length()<e2.length()?e1:e2).get();
		System.out.println(check1);
		//35.Java program to all elemnts from array who start with1
		int arr8[]= {10,20,30,11,14,56};
		System.out.println("=============");
		Arrays.stream(arr8).boxed().map(t->t+"").filter(t->t.startsWith("1")).forEach(System.out::print);
		//36 String Joiner example
		
		String str11[]= {"deepak","manjit","rahul"};
		String s1=String.join("|", str11);
		System.out.println(s1);
		String s3=String.join("|", Arrays.asList("Deepak","Manjit","raj"));
		System.out.println(s3);
		//37 Display fruits/brand and its count
		List<String>prodList=Arrays.asList("apple","samsung","motorola","apple","samsung");
		Map<String,Long>pr=prodList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(pr);
		//list of integer fourth largest even number
		List<Integer>al7=Arrays.asList(11,2,5,6,7,8,10,24);
		int fs=al7.stream().filter(p->p%2==0).sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
		System.out.println(fs);
		//checck number is prime or not
		int n=31;
		int prime=0;
		for(int j=2;j<n&&prime!=1;j++)
		{
			if(n%j==0)
			{
				prime++;
			}
		}
		if(prime==1)
		{
			System.out.println("given number is not prime");
		}
		else
		{
			System.out.println("given number is prime number");
		}
		
		//count occurences of each number
		int arr17[]= {1,2,3,4,5,5,5};
		Map<Integer, Long>iop=Arrays.stream(arr17).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(iop);
		
		//remove dulicate element
		List<Integer>iop1=Arrays.stream(arr17).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().filter(p->p.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
		System.out.println(iop1);
		//1,2,3,4
		
		// Remove duplicates and keep only one of each value
		
		List<Integer> uniqueList = Arrays.stream(arr17)
		        .distinct()  // removes duplicates
		        .boxed()     // converts int to Integer
		        .collect(Collectors.toList());

		System.out.println(uniqueList);
		//1,2,3,4,5
		
		//factorial using recursion
		//done
		
		//find second smallest in array using jdk8
		int arr9[]= {33,56,77,88,31};
		int min=IntStream.of(arr9).sorted().skip(1).min().getAsInt();
		System.out.println(min);
		//with logic
		int arr10[]= {33,56,77,88,31};
		int small=arr10[0];
		int cnt_tab=0;
		for(int k=1;k<arr10.length&&cnt_tab!=2;k++)
		{
			if(small<arr[k]) 
			{
				cnt_tab++;
				if(cnt_tab==2)
				{
				small=arr[k];
				}
			}
		}
		System.out.println(small);
		//find second larrgest in array with jdk8
		int arr11[]= {33,56,77,88,31};
		int jm=Arrays.stream(arr11).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(jm);
		//find second larrgest in array 
		
		int lar=arr10[0];
		int cnt_tab1=0;
		for(int k=1;k<arr10.length&&cnt_tab1!=2;k++)
		{
			if(small<arr[k]) 
			{
				cnt_tab1++;
				if(cnt_tab1==2)
				{
				lar=arr[k];
				}
			}
		}
		//mobile dynamic
		
		//remove duplicate value from array
		//reverse number on same place
		//shift all zero in begining ,last with 1 and other number combination
		//sort in asceding order
		//sort in descending order
		//sort name in string array
		//find total wrod
		//find uniue character in string
		//count small and capital charcater individually
		//find character and its count
		//binary search using recursion and simple
		//============================================
		//different sorting
		//linked list op create,addhead,countnodes,add tail,add middle.
		//SL
		//implement stack
		//implement ueue
		//remove element from arraylist without use another arraylist
		//how to fetch student as key and other as value from map
		//default method access
		//static method access
		//write of lambda expression
		//sorting

		
		
	}
	

}
