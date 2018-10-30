import java.io.IOException;

public class Program {

    void execute() throws IOException {
        int quantity = new InputData().getData();
        for (int i = 0; i < quantity; i++) {
            new OutputData().showResult(new InputData().getData());
        }
    }
}