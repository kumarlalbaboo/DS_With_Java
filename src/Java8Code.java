import LatestInterviewQuestions.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Code {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Lalu", "Male", "IT", 70000.00, 36 ));
        list.add(new Employee(102, "Abhimanyu", "Male", "HR", 50000.00, 86 ));
        list.add(new Employee(103, "Simpi", "Female", "IT", 77000.00, 19 ));
        list.add(new Employee(104, "Abhimanyu", "Male", "Account", 70000.00, 22 ));
        list.add(new Employee(105, "Bharti", "Female", "HR", 98000.00, 56 ));


        // ## Remove duplicates from an array.
        Integer[] arr5 = {1, 2, 3, 2, 4, 1, 5};


        //##. Write a code to move all zero elements to the end side using Java 8.
        Integer[] arrays = {1,0,1,0,0,1,0,1};

        //##. Find the employee with the highest salary


        //##. Find the top 4 employees with the highest salary


        //##. Find the employees who are getting the 2nd highest salary


        //##. Find the employees who are getting the 3rd highest salary


        //##. Find the employees who are getting the 3rd highest salary if multiple persons have the same salary


        System.out.println();
        //1. Sort employee based on salary


        System.out.println();
        //2. Sort employee based on name


        System.out.println();
        //3. Count the total number of employees


        System.out.println();
        //4. Count the total number of employees based on department/name.


        System.out.println();
        //5. Concatenate two lists using flatmap
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9);


        System.out.println();
        //6. Find avg,max,min,sum,count salary of employee


        System.out.println();
        //7. Find the name of all employee


        System.out.println();
        //8. Find the distinct name of employee

        System.out.println();
        //9. Get employee name whose employee id is greater than 102


        System.out.println();
        //10. Find an employee name whose age is less than 40


        System.out.println();
        //11. Sum of square of array number
        int[] arr = {1,2,3,4,5,6};


        System.out.println();
        //12. Sum of square of only even number


        System.out.println();
        //13. Display name start with 'S'


        System.out.println();
        //14. Display name starts with 'A' and the age is greater than 40


        System.out.println();
        //15. Sort the array value and print in ascending order
        Integer[] array = {33,86,23,65,50};

        System.out.println();
        //16. Sort the array value print in descending order

        System.out.println();
        //17. Find max value in arrays

        System.out.println();
        //18. Find min value in arrays

        System.out.println();
        //19. To find the First maximum number

        System.out.println();
        //20. To find second maximum number

        System.out.println();
        //21. To find third maximum number

        System.out.println();
        //22. Find the first minimum number in arrays

        System.out.println();
        //23. Find the second minimum number in arrays

        System.out.println();
        //24. Find the third minimum number in arrays

        System.out.println();
        //25. Find a name whose length is greater than 5.

        System.out.println();
        //26. Find the occurrences of each character in string
        String string = "abcdca";

        System.out.println();
        //27. Find the first repeating character

        System.out.println();
        //28. Find first Non-Repeating character

        System.out.println();
        //29. Find the occurrences of each word
        String[] word = {"radha", "shayam", "radha", "shayam", "lalbaboo", "abhimanyu" };


        System.out.println();
        //30. Display a duplicate element with count

        System.out.println();
        //31. Non-Duplicate element with count

        System.out.println();
        //32. Find a duplicate element in string

        System.out.println();
        //33. Find a distinct element in string


        System.out.println();
        //34. Find the longest string in a String array     //reduce() function is a terminal operation in streams used to combine elements into a single result.
        String[] stringArray = {"Java", "SpringBoot", "Microservices", "Spring", "Hibernate"};


        System.out.println();
        //35. Find the smallest string in a String array


        System.out.println();
        //36. Write a program to find elements from arrays who start with 1.
        Integer[] arr1 = {45, 11, 34, 15, 24};


        System.out.println();
        //37. String joiner example
        List<String> strings = Arrays.asList("Hello", "Lalbaboo", "Kumar");


        System.out.println();
        //38. Display fruits/brand and its count
        List<String> fruits = Arrays.asList("banana", "apple", "samsung", "motorola", "apple", "samsung");

        System.out.println();
        //39. Sort an employee based on salary if salary same then sort on based of name.


    }

}
