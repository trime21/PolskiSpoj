import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    void execute() {
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            int number = input.nextInt();
            if (number > 9) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                new Palindrome().test(number, list);
            }
            else
                System.out.println(number + " 0");
        }
    }
}
