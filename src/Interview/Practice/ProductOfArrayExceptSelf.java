package Interview.Practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int product =  1;
            for (int j = 0; j < n; j++) {
                if(i != j){
                    product *= arr[j];
                }
            }
            res[i] = product;
        }

//        int prefix = 1;
//        for (int i=0; i<n; i++){
//           res[i] = prefix;
//           prefix *= arr[i];
//        }
//
//        int suffix = 1;
//        for (int i=n-1; i>=0; i--){
//            res[i] *= suffix;
//            suffix *= arr[i];
//        }
        //System.out.println("Product of array except self is "+ Arrays.toString(res));
        System.out.println("Product of array except self is: ");
        for (int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }
}
