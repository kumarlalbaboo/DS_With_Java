package Interview.Practice.Array;

public class DecimalToOctal {
    public static void main(String[] args) {
        int num = 24;
        String str = "";

        while(num != 0){
            str = (num%8) + str;
            num = num/8;
        }
        System.out.println("Octal conversion: "+str);
    }
}
