import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double delta;
        String insert;
        try {
            while ((insert = input.readLine()).length() != 0) {
                try {
                    String[] inputData = insert.split(" ");
                    delta = (Double.parseDouble(inputData[1]) * Double.parseDouble(inputData[1]) - 4 * Double.parseDouble(inputData[0]) * Double.parseDouble(inputData[2]));
                    if (delta < 0)
                        System.out.println("0");
                    else if (delta == 0)
                        System.out.println("1");
                    else
                        System.out.println("2");
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
    }
}