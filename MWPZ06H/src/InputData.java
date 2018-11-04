import java.io.*;

public class InputData {

    String getData() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return input.readLine();
    }
}