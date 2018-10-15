import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String inputData;
        try {
            while ((inputData = input.readLine()).length() != 0) {
                try {
                    System.out.println((sum += Integer.parseInt(inputData)));
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
    }
}