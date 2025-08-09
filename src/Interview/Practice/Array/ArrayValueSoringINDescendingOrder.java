package Interview.Practice.Array;

public class ArrayValueSoringINDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {5,78,20,44,23,30};

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
