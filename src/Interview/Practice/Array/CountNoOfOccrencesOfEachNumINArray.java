package Interview.Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccrencesOfEachNumINArray {
    public static void main(String[] args) {

        int[] arr = {2,5,6,7,2,5,6,8,8,9,9,2,6};

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        }


//        boolean[] visited = new boolean[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (visited[i]) {
//                continue; // Skip already counted elements
//            }
//
//            int count = 1; // Current element occurs at least once (itself)
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    visited[j] = true; // Mark duplicate as visited
//                }
//            }
//
//            System.out.println(arr[i] + " comes " + count + " times");
//        }
    }
}
