package com.logical.program.Array;

public class FindSecondLargestNumberINArray
{
	public static void main(String[] args) {
		
	int arr[]= {14,10,56,11,17};
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
	
	System.out.println("second largest value in array"+lar);
	
}


}
