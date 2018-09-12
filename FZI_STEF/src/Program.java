import java.util.Scanner;

public class Program {
    static void execute() {
        int numberOfCities, zysk;
        int result = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);
        numberOfCities = input.nextInt();
        for (int i = 0; i < numberOfCities; i++) {
            zysk = input.nextInt();
            result += zysk;
            if (result < 0) {
                result = 0;
            }
            if (result > max) {
                max = result;
            }
        }
        System.out.println(max);
    }
}
