package com.logical.program.arrayinterviewproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviwArray
{
	public static void main(String[] args) 
	{
		//array value sorting in Ascending order
		System.out.println("=========1===========");
		
		int arr[]= {12,15,67,88,13};
		for(int i=0;i<arr.length;i++)
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
		System.out.println(Arrays.toString(arr));
		
		//using jdk8
		System.out.println("sorting using jdk8");
		IntStream.of(arr).sorted().forEach(e->System.out.print(e+" "));
		
		/*Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }*/
		
		System.out.println("\n=========2===========");
		
		//array value sorting in descending order
		
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
		System.out.println(Arrays.toString(arr));
		
		//using jdk8
				System.out.println("sorting using jdk8 descensding");
				IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
		
        /*Arrays.sort(arr, Collections.reverseOrder());
        for (int num : arr) {
            System.out.print(num + " ");
        }*/
		
        /*Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }*/
		System.out.println("\n=====3=====");
		
		//count occurences of each occurences integer  in array
		
		Integer arr1[]= {1,2,4,5,4,4,2};
		
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
		for(Integer key:arr1)
		{
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
		
		//using jdk8
		Map<Integer, Long>mo=Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("mo"+mo);
		
		
		
		System.out.println("=====4=====");
		
		//count occurences of each occurences character  in array
		
		String str="indiabi gcountr  yYY";
		HashMap<Character, Integer>mip=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			//char ch=Character.toLowerCase(str.charAt(i));
			mip.put(ch, mip.getOrDefault(ch, 0)+1);
		}
		System.out.println(mip);
		
		//using jdk8
		Map<String, Long>lk=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(lk);
		//dynamic mobile with zero at begining
		System.out.println("=====================");
		int input[]= {6,7,8,9,1};
		int max_lenth=10;
		int temp[]=new int[max_lenth-input.length];
		int final_arr[]=new int[max_lenth];
		int count=0;
		for(int i=0;i<temp.length;i++)
		{
			final_arr[count]=0;
			count++;
				
		}
		for(int i=0;i<input.length;i++)
		{
			final_arr[count]=input[i];
			count++;
			
		}
		System.out.println(Arrays.toString(final_arr));
		
		//or
		int result[]=new int[max_lenth];
		int start_index=max_lenth-input.length;
		for(int i=0;i<input.length;i++)
		{
			result[start_index+i]=input[i];
			//result[i]=input[i];
		}
		System.out.println("===="+Arrays.toString(result));
		
		System.out.println("======================");
		
		//dynamic mobilr zero as last
		int test[]= {3,5,7,2,8,5};
		int mobile=10;
		int temp_fs[]=new int[mobile-test.length];
		int result_arr[]=new int[mobile];
		int cnt=0;
		for(int i=0;i<test.length;i++)
		{
			result_arr[cnt]=test[i];
			cnt++;
		}
		for(int i=0;i<temp_fs.length;i++)
		{
			result_arr[cnt]=temp_fs[i];
			cnt++;
		}
		System.out.println(Arrays.toString(result_arr));
		
		//or
		System.out.println("or");
		int my_input[]= {3,5,7,2,8,5};
		int r1[]=new int[10];
		for(int i=0;i<my_input.length;i++)
		{
			r1[i]=my_input[i];
		}
		System.out.println(Arrays.toString(r1));
		
		//find second smallest in array
		System.out.println("===============");
		int myarray[]= {12,11,16,17,89};
		int small=arr[0];
		int cntt=0;
		for(int i=1;i<myarray.length&&cntt!=2;i++)
		{
			if(myarray[i]<small)
			{
				cntt++;
				if(cntt==2)
				{
			    small=myarray[i];
				}
			}
		}
		System.out.println("second smallest"+small);
		System.out.println("-----------");
		
		//find first smaalest in array
		
		
		System.out.println("===============");
		//int myarray[]= {12,11,16,17,89};
		for(int i=1;i<myarray.length;i++)
		{
			if(myarray[i]<small)
			{
			    small=myarray[i];
				
			}
		}
		System.out.println("first small:- "+small);
		
		//find find first largest in array
		
		//int myarray[]= {12,11,16,17,89};
		for(int i=1;i<myarray.length;i++)
		{
			if(myarray[i]>small)
			{
			    small=myarray[i];
				
			}
		}
		System.out.println("first large:- "+small);
		
		//find second largest in array
		    
		System.out.println("===============");
		int myarray_1[]= {12,11,16,17,89};
		int small_1=arr[0];
		int cntt_1=0;
		for(int i=1;i<myarray_1.length&&cntt!=2;i++)
		{
			if(myarray_1[i]>small_1)
			{
				cntt_1++;
				if(cntt_1==2)
				{
			    small_1=myarray_1[i];
				}
			}
		}
		System.out.println("second largest"+small_1);
		System.out.println("-----------");
		
		
		//shift all zero in beginging
		
		
	}

}










//print prime number in array
//missing value in array
//duplicate value in array
//uniue value in array
//remove duplicate value from array
//reverse number on same place
//String input ="TodayIsTuesday8thApril2025"; output:- 5202821

/*int[] a = {31,22,13,45,65};

input = 2

output = 13,45,65,31,22

input = 3
output = 45,65,31,22,13*/


/*String s = "15EAC2B"

output = ABCE125*/

/*
*you have an arrays of zeros (0) and (1), you need to sort it with less t.c and constant s.c
e.g Integer array[] =[1,1,0,1,0] -> output : [0,0,1,1,1]
*/

//remove array odd number
//remove array even number
//replace odd number with even even number with odd
//create custom arraylist



