package Interview.Practice.Array;

public class ConvertDecimalNumberToBinaryNumber {
    public static void main(String[] args) {
        int num = 10;
        String str ="";

        while(num !=0){
            str = (num%2)+str;
            num = num/2;
        }
        System.out.println("Binary Conversion: "+str);
    }
}
