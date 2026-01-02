package LatestInterviewQuestions;

// Find the second largest number from an array.

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumInAnArray {
    public static void main(String[] args) {

        Integer[] arr = {100,30,40,90,110,750,10};

        int secondLargest = Arrays.stream(arr).distinct().sorted(Collections.reverseOrder())
                .skip(1).findFirst().orElseThrow(()-> new RuntimeException("No second largest number found!"));
        System.out.println(secondLargest);

    }
}
/*
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for(int num : arr){
    if(num > largest){
        secondLargest = largest;
        largest = num;
    } else if ( num > secondLargest && num < largest) {
        secondLargest = num;
    }
}
System.out.println("Second largest: "+secondLargest);
*/

/*
int n = arr.length;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(arr[i]<arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
int res = arr[n-2];
System.out.println(res);

*/
