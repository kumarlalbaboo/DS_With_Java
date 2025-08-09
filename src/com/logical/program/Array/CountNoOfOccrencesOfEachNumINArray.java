package com.logical.program.Array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountNoOfOccrencesOfEachNumINArray
{
	public static void main(String[] args) 
	{
		/*int arr[]= {2,3,5,5,5,1,8,9,17,9,9,9};
		TreeMap<Integer, Integer>map=new TreeMap<Integer, Integer>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Entry<Integer, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}*/
		
		String names[]= {"deep","manj","ashish","manj","deep","deep"};
		TreeMap<String, Integer>map=new TreeMap<String, Integer>();
		for(String name:names)
		{
			map.put(name, map.getOrDefault(name, 0)+1);
		}
		for(Entry<String, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}

}
