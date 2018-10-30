import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputData {

    void showResult(int divisible, int limitValue, int notDivisible) throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int j = 1; j * divisible < limitValue; j++) {
            if (((divisible * j) % notDivisible) != 0)
                output.write(String.valueOf(j * divisible) + " ");
        }
        output.newLine();
        output.flush();
    }
}