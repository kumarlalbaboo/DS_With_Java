package com.logical.program.Array;

import java.util.Arrays;

public class dynamicmobilefillwithzeroBegining 
{
	public static void main(String[] args) {
		int[] input = {1, 7, 8, 9, 3, 4};
        int totalLength = 10;
        int[] result = new int[totalLength];

        // Fill last part of result with input values
        int startIndex = totalLength - input.length;
        
        for (int i = 0; i < input.length; i++) 
        {
            result[startIndex+i] = input[i];
        }

        System.out.println(Arrays.toString(result));
	}
	

}
