package Interview.Practice;// String str = "listen"; silent

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args){
        String str = "listen";
        String str2 = "silent";

        if(str.length() != str2.length()){
            System.out.println("Not anagram");
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c: str2.toCharArray()){
            if(!map.containsKey(c)){
                System.out.println("Not Anagram");
            }
            map.put(c, map.get(c)-1);
            if(map.get(c)== 0){
                map.remove(c);
            }
        }
        System.out.println(map.isEmpty() ? "Anagram" : "Not Anagram");

    }
}
