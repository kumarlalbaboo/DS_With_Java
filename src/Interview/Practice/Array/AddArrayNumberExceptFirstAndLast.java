package Interview.Practice.Array;

public class AddArrayNumberExceptFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,10,2,8,5,28};
        int sum = 0;

        for(int i=1; i<arr.length-1; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
