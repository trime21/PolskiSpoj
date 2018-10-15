import java.io.IOException;
import java.util.LinkedList;

public class Program {

    void execute() throws IOException {
        int quantity = Integer.parseInt(new InsertData().get());
        for (int i = 0; i < quantity; i++){
            String[] data = new InsertData().get().split(" ");
            int numerator = Integer.parseInt(data[0]);
            int denominator = Integer.parseInt(data[1]);
            if (numerator == denominator || denominator == 0)
                System.out.println("1");
            else {
                LinkedList<Integer> listOfNumerators = new ListNumbers().make(numerator - denominator + 1, numerator);
                LinkedList<Integer> listOfDenominators = new ListNumbers().make(1, denominator);
                System.out.println(Math.round(new Calculate().result(listOfNumerators, listOfDenominators)));
            }
        }
    }
}