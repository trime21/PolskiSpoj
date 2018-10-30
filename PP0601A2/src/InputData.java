import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {

    String getData() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return input.readLine();
    }
}