import java.io.IOException;

public class Program {

    void execute() throws IOException {
        int quantity = new InputData().getData();
        for (int i = 0; i < quantity; i++) {
            int number = new InputData().getData();
            System.out.println(number * number);
        }
    }
}