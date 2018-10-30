import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    void execute() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(input.readLine());
        for (int i = 0; i < quantity; i++) {
            String[] data = input.readLine().split(" ");
            System.out.println(new Calculate().result(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
        }
    }
}