import java.util.Scanner;

public class Program {

    void execute() {
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++){
            int numbers = input.nextInt();
            int[] data = new int[numbers];
            for (int j = 0; j < numbers; j++)
                data[j] = input.nextInt();
            new Show().result(new Move().toLeft(data));
            System.out.println();
        }
    }
}