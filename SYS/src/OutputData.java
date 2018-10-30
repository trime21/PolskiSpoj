import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputData {

    void showResult(int data) throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        output.write(Integer.toHexString(data).toUpperCase() + " " + Integer.toString(data, 11).toUpperCase());
        output.newLine();
        output.flush();
    }
}