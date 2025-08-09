package com.logical.program.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Testing 
{
	public static void main(String[] args) {
		//find pair of sum
		
		/*int[] arr = {2, 7, 11, 15, 5, 10};
	    int target = 17;*/
		//[0,3] and [1,5]
		
		//1.program
		
		int[] arr = {2, 7, 11, 15, 5, 10};
		int target=17;
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int key=target-arr[i];
			if(map.containsKey(key))
			{
				System.out.println("indeces"+map.get(key)+"and"+i);
			}
			map.put(arr[i], i);
		}
		
		//2.program 
		
		/*lengthOfLongestSubstring without duplicate*/
		
		String s = "abcabcbb";
		int i=0,j=0,maxlength=0;
		Set<Character>set=new HashSet<Character>();
		while(j<s.length())
		{
			char ch=s.charAt(j);
			if(!set.contains(ch))
			{
			set.add(ch);
			maxlength=Math.max(maxlength, j-i+1);
			j++;
			}
			else
			{
				set.remove(s.charAt(i));
				i++;
			}
			
		}
		System.out.println(maxlength);
		
		/*reverse of a number*/
		 /*1234
		   4321
		   -123
		   -321*/
		
		int rev=0;
		int n=453;
		for(;n!=0;n=n/10)
		{
			rev=(rev*10)+n%10;
		}
		System.out.println(rev);
		
	}
		      

}
