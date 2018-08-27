import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number;
        int quantity = input.nextInt();
        for (int i=0 ; i < quantity ; i++){
            number = input.nextInt();
            System.out.println(setPrimeResult(setPrimeTest(number)));
        }
    }

    static boolean setPrimeTest(int number){
        int divisor = 0;
        int i = 1;
        boolean primeTest = true;
        if (number == 1)
            primeTest = false;
        while(i <= number && primeTest) {
            int result = number / i;
            if (number == result * i) {
                divisor = divisor + 1;
            }
            if (divisor > 2) {
                i = number;
                primeTest = false;
            }
            i = i + 1;
        }
        return primeTest;
    }

    static String setPrimeResult (boolean primeTest){
        String primeResult;
        if (primeTest)
            primeResult = "TAK";
        else
            primeResult = "NIE";
        return primeResult;
    }
}
