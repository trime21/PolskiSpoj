import java.util.Scanner;

public class Program {
    static void execute(){
        Scanner input = new Scanner(System.in);
        int result = 0;
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            int base = input.nextInt();
            int index = input.nextInt();
            while (base > 9)
                base = base % 10;
            result = LastNumber.resultShow(base, result, index);
            System.out.println(result);
        }
    }
}
