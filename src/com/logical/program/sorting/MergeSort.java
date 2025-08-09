package com.logical.program.sorting;

public class MergeSort {
	
public static void main(String[] args)
{
	int listTosort[]= {15,32,67,89,42,17,80,70};
	int firstHalfArray[]=new int[listTosort.length/2];
	int secondHalfArray[]= {listTosort.length-firstHalfArray.length};
	divide(listTosort, firstHalfArray, secondHalfArray);
	concur(listTosort, firstHalfArray, secondHalfArray);
}
public static void divide(int[] listToSort,int []firstHalfArray,int []secondHalfArray)
{
	for(int i=0;i<listToSort.length;i++)
	{
		if(i<firstHalfArray.length)
		{
			firstHalfArray[i]=listToSort[i];
		}
		else
		{
			secondHalfArray[i-firstHalfArray.length]=listToSort[i];
		}
	}
}


public static void concur(int[] listToSort,int []firstHalfArray,int []secondHalfArray)
{
	int mergeIndex=0;
	int firstHalfIndex=0;
	int secondHalfIndex=0;
	while(firstHalfIndex<firstHalfArray.length&&secondHalfIndex<secondHalfArray.length)
	{
		if(firstHalfArray[firstHalfIndex]<secondHalfArray[secondHalfIndex])
		{
			listToSort[mergeIndex]=firstHalfArray[firstHalfIndex];
			firstHalfIndex++;
		}
		else if(secondHalfIndex<secondHalfArray.length)
		{
			listToSort[mergeIndex]=secondHalfArray[secondHalfIndex];
			secondHalfIndex++;
		}
		mergeIndex++;
	}
	
	if(firstHalfIndex<firstHalfArray.length)
	{
		while(mergeIndex<listToSort.length)
		{
			listToSort[mergeIndex++]=firstHalfArray[firstHalfIndex++];
		}
	}
}

}
