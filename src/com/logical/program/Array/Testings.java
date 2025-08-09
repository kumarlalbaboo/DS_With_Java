package com.logical.program.Array;

import java.util.HashSet;
import java.util.Set;

public class Testings 
{
	
	 /*public static int lengthOfLongestSubstring(String s)
	 {
	        Set<Character> set = new HashSet<>();
	        int maxLength = 0;
	        int i = 0, j = 0;

	        while (j < s.length()) {
	            char ch = s.charAt(j);

	            // If character not in set, add and move right pointer
	            if (!set.contains(ch)) {
	                set.add(ch);
	                maxLength = Math.max(maxLength, j - i + 1);
	                j++;
	            } else {
	                // If duplicate found, remove from left pointer side
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }

	        return maxLength;
	    }*/
	
	public static int lengthOfLongestSubstring(String s)
	{
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
		
		return maxlength;
		
	}
	
	public static void main(String[] args)
	{
		/*int arr[]= {2,7,11,15};
		int target=17;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("indeces value="+i+"and"+j);
				}
			}
		}*/
		
		
		        /*int[] arr = {2, 7, 11, 15, 5, 10};
		        int target = 17;

		        HashMap<Integer, Integer> map = new HashMap<>();

		        for (int i = 0; i < arr.length; i++) {
		            int complement = target - arr[i];

		            // If complement exists, print the pair
		            if (map.containsKey(complement)) {
		            	
		                System.out.println("Indices: " + map.get(complement) + " and " + i +
		                                   " -> Values: " + complement + " + " + arr[i]);
		            }

		            // Store the current number and its index
		            map.put(arr[i], i);
		        }*/
		
		
		     /*   int[] arr = {2, 7, 11, 15, 5, 10};
		        int target=17;
		        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		        for(int i=0;i<arr.length;i++)
		        {
		        	int key=target-arr[i];
		        	if(map.containsKey(key))
		        	{
		        		System.out.println("indices"+map.get(key)+"and"+i);
		        	}
		        	map.put(arr[i], i);
		        	
		        }*/
		        
		
		
		/*int rev=0;
		int n=123;
		for(;n!=0;n=n/10)
		{
			rev=(rev*10)+n%10;
		}
		System.out.println(rev);*/
		
		/*Given a string s, find the length of 
		the longaest substring without duplicate characters.
		window sliding approach*/
		        
		        String s = "abcabcbb";
		        int maxLength = lengthOfLongestSubstring(s);
		        System.out.println("Length of longest substring without duplicates: " + maxLength); 
		
		
	}

}
