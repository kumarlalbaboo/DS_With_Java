package Interview.Practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTringle {
    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<n; i++){
            int number = 1;
            for (int j=0; j<=i; j++){
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

//    public static List<List<Integer>> generate(int numRows) {
//
//        List<List<Integer>> tringle = new ArrayList<>();
//
//        for(int i=0; i<numRows; i++){
//            List<Integer> row = new ArrayList<>();
//
//            for(int j=0; j<=i; j++){
//                if(j==0 || j==i){
//                    row.add(1);
//                } else {
//                    int val = tringle.get(i-1).get(j-1) + tringle.get(i-1).get(j);
//                    row.add(val);
//                }
//            }
//            tringle.add(row);
//        }
//        return tringle;
//    }
//    public static void main(String[] args) {
//        int n=5;
//        List<List<Integer>> res = generate(n);
//
//        for(List<Integer> row : res){
//            System.out.println(row);
//        }
//    }

}
