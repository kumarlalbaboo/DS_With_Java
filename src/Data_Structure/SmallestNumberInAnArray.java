package Data_Structure;

// 1. Find the smallest number in an array (without using built-in methods).

public class SmallestNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {16, 90, 12, 5, 45, 68, 10, 36};

        int smallestNum = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallestNum){
                smallestNum = arr[i];
            }
        }
        System.out.println("Smallest number: "+smallestNum);
    }
}
