package Interview.Practice.Array;

public class CheckGivenNumberIsPalindromeOrNot {
    public static void main(String[] args) {
        int num = 121;
        int temp=num;
        int rev = 0;

        while (num != 0){                   //int lastDigit = n % 10;    // Extract the last digit
            rev = (rev*10) + num%10;        //rev = rev * 10;            // Shift current reversed number left by one digit
                                            //rev = rev + lastDigit;     // Add the extracted digit

            num = num/10;
        }

        if(temp == rev){
            System.out.println(temp+" is a palindrome number");
        } else {
            System.out.println(temp+" is not a palindrome number");
        }

    }
}
