import java.util.Scanner;

public class Execution {
    void executionProgram(){
        CheckNumber cn = new CheckNumber();
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            int number = input.nextInt();
            System.out.println(cn.getResult(number));
        }
    }
}
