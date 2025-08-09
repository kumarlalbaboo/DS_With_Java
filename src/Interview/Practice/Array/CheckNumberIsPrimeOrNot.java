package Interview.Practice.Array;

public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        int num = 77;

        int prime = 0;

        for(int i=2; i*i <= num; i++){     //for(int i=2; i<= Math.sqrt(num); i++)
            if (num%i == 0){
                prime++;
            }
        }
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else if(prime == 0){
            System.out.println(num + " is a prime number.");
        }else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
