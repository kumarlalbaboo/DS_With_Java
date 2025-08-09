package com.logical.program.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//remove duplicate of  value in array
public class RemoveDuplicateValueFromArr
{
	public static void main(String[] args) 
	{
		/*int i,j,count,sum=0;
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five number");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		for(i=0;i<=sum;i++)
		{
			count=0;
			for(j=0;j<5;j++)
			{
				if(arr[j]==i)
				{
					count++;
					if(count==1)
					{
						System.out.print(i+"\t");
					}
					else
					{
					}

				}
			}
			
		}*/
		
		int arr[]= {2,4,6,2,8,9,1,4,6};
		Set<Integer>removeDuplicate=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			removeDuplicate.add(arr[i]);
		}
		System.out.println(removeDuplicate);
		for(Integer i:removeDuplicate)
		{
			System.out.print(i+" ");
		}
		
	}

}
