import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    void execute() {
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        input.nextLine();
        for (int i = 0; i < quantity; i++) {
            ArrayList<Character> listFirst = new ArrayList<Character>();
            ArrayList<Character> listSecond = new ArrayList<Character>();
            String words = input.nextLine();
            new StringToList().make(words, listFirst, listSecond);
            new ShowList().show(new NewString().merge(listFirst, listSecond));
        }
    }
}
