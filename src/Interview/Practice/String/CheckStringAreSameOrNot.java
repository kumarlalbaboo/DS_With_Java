package Interview.Practice.String;

public class CheckStringAreSameOrNot {
    public static void main(String[] args) {
        String str = "Lalbaboo";

        String str2 = "Lalbaboo";

        if(str.equalsIgnoreCase(str2)) {
            System.out.println("String are same");
        } else {
            System.out.println("String are not same");
        }
    }
}
