package Interview.Practice.Array;

public class CheckGivenNumberIsArmstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while (num != 0){
            int r = num%10;
            sum += r*r*r;
            num = num/10;
        }

        if(sum == temp){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }

    }
}
