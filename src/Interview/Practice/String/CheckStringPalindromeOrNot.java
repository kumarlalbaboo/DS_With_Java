package Interview.Practice.String;

public class CheckStringPalindromeOrNot {
    public static void main(String[] args) {
        String str = "madam";

        String temp = "";

        for(int i=str.length()-1; i>=0; i--){
            temp = temp+str.charAt(i);
        }
        if(str.equals(temp)){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }
    }
}
