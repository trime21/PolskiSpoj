import java.util.Scanner;

public class Program {
    static void execute() {
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            int aNumber = input.nextInt();
            int bNumber = input.nextInt();
            System.out.println(GreatestCommonDivisor.show(aNumber, bNumber));
        }
    }
}