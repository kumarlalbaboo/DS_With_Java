package Interview.Practice.JDK8Example;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "python", "react", "angular", "javascript");

        //Method 1
        List<String> upperCaseString = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Output using method 1");
        System.out.println(upperCaseString);

        //Method 2
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
