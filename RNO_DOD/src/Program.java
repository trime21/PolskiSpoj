import java.util.Scanner;

public class Program {
    static void execute(){
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for (int i = 0; i < quantity ; i++){
            int pairs = input.nextInt();
            int sum = 0;
            for (int j = 0; j < pairs ; j++){
                sum += input.nextInt();
            }
            System.out.println(sum);
        }
    }
}
