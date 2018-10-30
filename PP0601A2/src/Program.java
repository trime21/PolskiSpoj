import java.io.IOException;

public class Program {

    void execute() throws IOException {
        int number = 0;
        int lastNumber = 42;
        while (number != 3) {
            int currentNumber = Integer.parseInt(new InputData().getData());
            if (currentNumber == 42 && lastNumber != 42)
                number++;
            lastNumber = currentNumber;
            System.out.println(currentNumber);
        }
    }
}