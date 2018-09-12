public class PrimeNumberResult {
    static boolean set(int number){
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
}