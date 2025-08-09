package com.logical.program.String;


public class SortingNameInString
{
	public static void main(String[] args) 
	{
		String temp="";
		String names[]= {"deepak","abhisek","manav","nehal","bablu"};
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
	}

}
