package com.logical.program.Array;

public class CheckGivenNumberIsPalindromeOrNot 
{
public static void main(String[] args) 
{
	int n=141;
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
		System.out.println("given number is not palindrome");
	}
	
}
}
