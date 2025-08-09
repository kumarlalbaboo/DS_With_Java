package com.logical.test.array;

public class BinarySearchUsingRecursion
{
	public static int binarySearch(int arr[],int low,int high,int key)
	{
		if(low>high)
		{
			return -1;
		}
		
		int mid=(low+high)/2;
		
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(key<arr[mid])
		{
			return binarySearch(arr, low, mid-1, key);
		}
		else
		{
			return binarySearch(arr, mid+1, high, key);
		}
		
		
	}
	public static void main(String[] args)
	{
		int arr[]= {12,15,17,13,18,45,55};
		int low=0;
		int high=arr.length-1;
		int key=45;
		int result=binarySearch(arr,low,high,key);
		if(result!=-1)
		{
			System.out.println("element found at position->"+(result+1));
		}
		else
		{
		System.out.println("element not found");
		}
		
	}

}
/*Best Case: O(1) — when the element is found at the middle index.

Average and Worst Case: O(log n) — where n is the number of elements in the array.

Space Complexity: O(log n) — due to the recursive function calls.

If you used an iterative approach instead, the space complexity would be O(1).*/