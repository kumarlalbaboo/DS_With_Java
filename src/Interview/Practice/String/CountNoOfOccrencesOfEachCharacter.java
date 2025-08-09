package Interview.Practice.String;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccrencesOfEachCharacter {
    public static void main(String[] args) {
        String str = "Lalbaboo";

        str = str.toLowerCase();

        HashMap<Character, Integer> countMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(countMap.containsKey(ch)){
                countMap.put(ch, countMap.get(ch)+1);
            }else {
                countMap.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        }


    }
}
