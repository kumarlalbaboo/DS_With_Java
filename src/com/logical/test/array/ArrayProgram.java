package com.logical.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayProgram
{
public static void main(String[] args) 
{
	/*Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	int sum=0;
	int add_except_first_and_last=0;
	int add_first_and_last=0;
	System.out.println("enter five number in array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
		if(i==0||i==4)
		{
			add_first_and_last=add_first_and_last+arr[i];
		}
		else
		{
			add_except_first_and_last=add_except_first_and_last+arr[i];
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println("sum of array"+sum);
	
	System.out.println("add array except first and last"+add_except_first_and_last);
	System.out.println("add first and last"+add_first_and_last);
	*/
	//array value sorting in descending order
	/*int arr[]= {23,56,78,11,15};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));*/
	
	//array value sorting in Ascending order
	
	
	/*for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));*/
	//given number is armstring or not
	/*int n=153;
	int temp=n;
	int rev=0;
	for(;n!=0;n=n/10)
	{
		rev=rev+(n%10)*(n%10)*(n%10);
	}
	if(temp==rev)
	{
		System.out.println("given number is armstrong");
	}
	else
	{
		System.out.println("given number is not armstrong");
	}*/
	
	//given number is palindrome or not
	
	/*int n=671;
	int temp=n;
	int rev=0;
	for(;n!=0;n=n/10)
	{
		rev=(rev*10)+n%10;
	}
	if(temp==rev)
	{
		System.out.println("given number is plaindrome");
	}
	else
	{
		System.out.println("given number is not plaindrome");
	}*/
	
	//check the number is prime or not
	
	/*int n=18;
	int prime=0;
	for(int i=2;i<n&&prime!=1;i++)
	{
		if((n%i)==0)
		{
			prime++;
		}
	}
	if(prime==0)
	{
		System.out.println("given number is prime");
	}
	else
	{
		System.out.println("given number is not prime");
	}*/
	
	//convert decimal number to binary
	/*int n=5;
	String str="";
	
	while(n!=0)
	{
		str=(n%2)+str;
		n=n/2;
	}
	System.out.println(str);*/
	
	//count num of coocuerences of each number in array
	/*int arr[]= {1,2,1,1,4,6,7,7,2,2,2,4};
	Map<Integer,Integer>map=new HashMap<Integer, Integer>();
	for(int key:arr)
	{
		map.put(key, map.getOrDefault(key, 0)+1);
	}
	System.out.println(map);*/
	
	//count num of coocuerences of each character in arraytring
	//String str="adfhafahfaf";
	//char[] chars=str.toCharArray();
	//char[] chars= {'a','b','a','d','t','a','b'};
	 
	/*Map<Character,Integer>map=new HashMap<Character, Integer>();
	for(char ch:chars)
	{
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	System.out.println(map);*/
	
	//count total number of digit
	/*int n=12345;
	int count=0;
	for(;n!=0;n=n/10)
	{
		count++;
	}
	System.out.println("total digit");
	System.out.println(count);*/
	
	//decimal to octal
	
	/*int n=10;
    String str="";
	while(n!=0)
	{
		str=(n%8)+str;
		n=n/8;
	}
	System.out.println(str);*/
	
	//dynamic mobile replace zero at begining
	
	/*int arr[]= {1,2,3,4,5,6};
	int target=10;
	int output[]=new int[target];
	int count=0;
	int left_index=target-arr.length;
	for(int i=0;i<left_index;i++)
	{
		output[count]=0;
		count++;
	}
	for(int i=0;i<arr.length;i++)
	{
		output[count+i]=arr[i];
	}
	System.out.println(Arrays.toString(output));*/
	
	//2 way
	
	/*int input[]= {1,2,3,4,5,7};
	int target_i=10;
	int my_output[]=new int[target_i];
	int start_index=target_i-input.length;
	for(int i=0;i<input.length;i++)
	{
		my_output[i]=input[i];
	}
	System.out.println(Arrays.toString(my_output));*/
	
	//print fabonacci number between 0 to 100
	
	/*for(int i=0,b=1,c=0,a=0;c<100;c=a+b,i++)
	{
		System.out.print(c+" ");
		a=b;
		b=c;
	}*/
	
	/*int n=7;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);*/
	
	//find factorial using recursion
	
	/*int result=fact(7);
	System.out.println(result);*/
	
	
	//find largest value in array

	/*int arr[]= {23,45,67,89,45};

	int lar=arr[0];

	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>lar)
		{
			lar=arr[i];
		}
	}
	System.out.println("largest number="+lar);*/
	
	//find missing element in array
	
	/*HashSet<Integer>has=new HashSet<Integer>();
	int arr[]= {1,2,3,4,5};
	for(int i=0;i<10;i++)
	{
		has.add(i);
	}
	for(int ele:arr)
	{
		has.remove(ele);
	}
	System.out.println(has);*/
	
	//find prime number in array
	/*int arr[]= {31,90,100,23,88};
	int prime;
	for(int i=0;i<arr.length;i++)
	{
		prime=0;
		for(int j=2;j<arr[i];j++)
		{
			if((arr[i]%j)==0)
			{
			prime++;	
			}
		}
		if(prime==0)
		{
			System.out.print(arr[i]+" ");
		}
	}*/
	
	//find second largest numbers
	/*int arr[]= {14,10,56,11,17};
	int lar=arr[0];
	int count=0;
	for(int i=1;i<arr.length&&count!=2;i++)
	{
		
		if(arr[i]>lar)
		{	
			count++;
			if(count==2)
			{
			lar=arr[i];
			}
		}	
		
	}
	
	System.out.println("second largest value in array"+lar);*/
	
	//find smallest number in array
	/*int arr[]= {14,67,89,11,33,87};
	
	int small=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	System.out.println("smallest number"+small);*/
	
	//find second smallest number in array
	
	/*int arr[]= {14,67,89,11,33,87};
	int small=arr[0];
	int count=0;
	for(int i=1;i<arr.length&&count!=2;i++)
	{
	if(arr[i]<small)
	{
		count++;
		if(count==2)
		{
		small=arr[i];
		}
	}
	}
	System.out.println(small);*/
	
	//print fabonaci based on input
	
	/*int n=5;
	
	for(int i=0,b=1,c=0,a=0;i<10;c=a+b,i++)
	{
		System.out.print(c+" ");
		a=b;
		b=c;
	}*/
	
	//remove duplicate value from the array
	
	/*int arr[]= {1,2,3,2,2,4,5,6,7,7,2};
	Set<Integer> set=new HashSet<Integer>();
	
	for(int key:arr)
	{
		set.add(key);
	}
	System.out.println(set);*/
	
	//reverse the number on same place
	
	/*int arr[]= {34,67,89,32,21};
	int n;
	
	for(int i=0;i<arr.length;i++)
	{
		n=arr[i];
		int rev=0;
		for(;n!=0;n=n/10)
		{
			rev=(rev*10)+n%10;
		}
		System.out.print(rev+" ");
		
		
	}*/
	
	//find pair of sum
	
	/*int arr[]= {1,2,3,5,6,9,13};
	int target=11;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]+arr[j]==target)
		{
			System.out.println("indeces"+i+" and "+j);
		}
		}
	}*/
	
	//2 way
	/*int arr[]= {1,2,3,5,6,9,13};
	int target=11;
	Map<Integer,Integer>map=new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++)
	{
		int key=target-arr[i];
		if(map.containsKey(key))
		{
		System.out.println("indices"+map.get(key)+"and"+ i);
		}
		map.put(arr[i], i);
	}*/
	
	//lengthOfLongestSubstring
	
	//reverse of number
	
	/*int rev=0;
	int n=453;
	for(;n!=0;n=n/10)
	{
		rev=(rev*10)+n%10;
	}
	System.out.println(rev);*/
	
	
	/*int[] a = {31,22,13,45,65};

	input = 2
	 
	output = 13,45,65,31,22
	 
	input = 3
	output = 45,65,31,22,13*/
	
	
    /*int count=2;
	
	int[] a = {31,22,13,45,65};
	
	//create array To store element before the count elements
	
	int[] temp = new int[count]; 
	
	// Store first 'count' elements before they are overwritten
	
	for (int i = 0; i < count; i++) {
        temp[i] = a[i];
    }
	
	// Store elements after count
	
	int j=0;
	for(int i=count;i<a.length;i++)
	{
		
		a[j]=a[i];
		j++;
	}
	
	// Append stored elements at the end

	
	for (int i = 0; i < temp.length; i++) {
        a[j] = temp[i];
        j++;
    }
	
		
	System.out.println(Arrays.toString(a));
	output=[13, 45, 65, 31, 22]*/
	
	//remove element from the same arraylist without create new arraylist
	
	 /*List<Integer> al = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
	 for (Integer number : al) {
            if (number % 2 == 1) {
                al.remove(number); 
            }
        }

        System.out.println(al); */
	
	/*List<Integer>list=new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
	for(Integer num:list)
	{
		if(num%2==1)
		{
			list.remove(num);
		}
	}
	System.out.println(list);*/
	
	//2 way
	
	/*List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	Iterator<Integer>it=al.iterator();
	while (it.hasNext())
	{
	Integer val=it.next();
	if(val%2==1)
	{
		it.remove();	
	}
	
	}
	System.out.print(al);*/
	
	
	//iterate map value with student and course
	/*HashMap<Student, String>stud=new HashMap<Student, String>();
	stud.put(new Student(1, 21, 3456.67), "MCA");
	stud.put(new Student(2, 22, 3458.67), "MBA");
	for(Map.Entry<Student, String>entry:stud.entrySet())
	{
		Student s = entry.getKey();
        String course = entry.getValue();
        System.out.println("key: " + s.id + ", Age: " + s.age + ", Fee: " + s.fee + ", value: " + course);
	}*/
	
	//find each charcter count
	
	/*String str="indiabi gcountr  yY";
	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i); 
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	System.out.println(map);*/
	
	/*String s = "15EAC2B"

	output = ABCE125*/
	
	/*String str="15EAC2B";

	String str1="";
	String str2="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>=48&&ch<=57)
		{
			str1=str1+ch;
		}
		else
		{
			str2=str2+ch;
		}
	}
	System.out.println(str2+str1);
	char ch1[]=str2.toCharArray();
	char ch2[]=str1.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	System.out.println(new String(ch1)+new String(ch2));*/
	
}

/*public static int fact(int n)
{
	if(n==0)
	{
		return 1;
	}
	else
	{
		return n*fact(n-1);
	}
}*/
	

/*String s = "15EAC2B"

output = ABCE125*/

//group the names based on the department.
		//Map<String,List<String>>dept=emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
		//System.out.println(dept);
		//dept.forEach((depts,names)->System.out.println(depts+":"+names));

/*public class Employee 
{
	private int id;
	private String name;
	private List<String>skill;
}*/

//Get all skills from all employees (flattened)
/*List<String> allSkills = employees.stream()
                                  .flatMap(e -> e.getSkill().stream())
                                  .collect(Collectors.toList());

System.out.println("All Skills: " + allSkills);*/

//list of integer fourth largest even number

/*List<Integer>list =Arrays.asList(12,15,68,44,22,90,91,78,30);
Integer val= list.stream().filter(p->p%2==0).sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
System.out.println(val);*/

}


 class Student {
	
	int id;
	int age;
	double fee;
	
	
public Student(int id, int age, double fee) {
		this.id = id;
		this.age = age;
		this.fee = fee;
	}
 }
