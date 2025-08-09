package LatestInterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the first non-repeating character in a string.

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "Swiss";

        Optional<String> result = Arrays.asList(str.split("")).stream().map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        result.ifPresentOrElse(
                c-> System.out.println("First Non-Repeating character: "+c),
                ()-> System.out.println("No non-repeating character found.")
        );

    }
}
