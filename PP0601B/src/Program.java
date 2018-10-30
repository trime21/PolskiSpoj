import java.io.IOException;

public class Program {

    void execute() throws IOException {
        int quantity = Integer.parseInt(new InputData().getData());
        for (int i = 0; i < quantity; i++) {
            String[] data = new InputData().getData().split(" ");
            int limitValue = Integer.parseInt(data[0]);
            int divisible = Integer.parseInt(data[1]);
            int notDivisible = Integer.parseInt(data[2]);
            new OutputData().showResult(limitValue, divisible, notDivisible);
        }
    }
}