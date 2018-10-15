import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String insert;
        try {
            while ((insert = input.readLine()).length() != 0) {
                try {
                    String[] array = insert.split(" ");
                    for (int i = array.length - 1; i >= 0; i--)
                        System.out.print(array[i] + " ");
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
    }
}