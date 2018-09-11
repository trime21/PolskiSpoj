import java.util.Scanner;

public class Execution {
    void executionProgram() {
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        input.nextLine();
        for (int i = 0; i < quantity; i++) {
            String word = input.nextLine();
            Result.show(Word.create(StringToList.create(word)));
        }
    }
}
