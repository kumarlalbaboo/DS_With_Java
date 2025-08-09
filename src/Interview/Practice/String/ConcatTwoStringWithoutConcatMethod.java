package Interview.Practice.String;

public class ConcatTwoStringWithoutConcatMethod {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";

        for(int i=0; i<str2.length(); i++){
            str1 = str1+str2.charAt(i);
        }

        System.out.println(str1);
    }
}
