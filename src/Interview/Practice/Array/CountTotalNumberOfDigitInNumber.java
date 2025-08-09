package Interview.Practice.Array;

public class CountTotalNumberOfDigitInNumber {
    public static void main(String[] args) {
        int num = 54785;

        int count = 0;

        while(num != 0){
            num = num/10;
            count++;
        }

        System.out.println("Count total number of digit: "+count);
    }
}
