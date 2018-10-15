import java.io.IOException;

public class Program {

    void execute() throws IOException {
        InsertData input = new InsertData();
        int quantity = Integer.parseInt(input.get());
        for (int i = 0; i < quantity; i++) {
            String[] data = input.get().split(" ");
            System.out.println(new Game().play(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
        }
    }
}