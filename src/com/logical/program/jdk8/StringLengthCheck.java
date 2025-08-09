package com.logical.program.jdk8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLengthCheck 
{
	public static void main(String[] args)
	{
		String str1[]= {"deepak","raj","sanuisfg","marc"};
		Arrays.stream(str1).filter(e->e.length()>5).forEach(System.out::print);
		
		String str = "ilovemyindiammoo";
		Map<String, Long> map_val = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(map_val);
		String str6 = "alliswellai";
		String key2 = Arrays.stream(str6.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(p -> p.getValue() == 1).findFirst().get().getKey();
		System.out.println(key2);
		String word[] = { "deepak", "ashish", "deepak", "deepak", "nehal", "ashish", "rupal" };
		Map<String, Long> name_count = Arrays.stream(word)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(name_count);
		
	}

}
