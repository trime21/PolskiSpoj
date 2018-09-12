import java.util.Scanner;

public class IsAPrimeNumber {
    static void execute() {
        Scanner input = new Scanner (System.in);
        int number;
        int quantity = input.nextInt();
        for (int i=0 ; i < quantity ; i++) {
            number = input.nextInt();
            System.out.println(PrimeNumberTest.value(PrimeNumberResult.set(number)));
        }
    }
}