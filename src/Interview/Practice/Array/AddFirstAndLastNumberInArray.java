package Interview.Practice.Array;

public class AddFirstAndLastNumberInArray {
    public static void main(String[] args) {
        int[] arr = {10,55,87,97,52,10};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            if(i == 0 || i == arr.length-1){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
