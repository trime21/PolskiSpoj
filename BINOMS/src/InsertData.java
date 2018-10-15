import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertData {

    String get() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String givenData = input.readLine();
        return givenData;
    }
}