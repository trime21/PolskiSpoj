import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class OutputData {

    void showResult(ArrayList<ArrayList> list) throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < list.size(); i++) {
            output.write(list.get(i) + " ");
            output.newLine();
        }
        output.flush();
    }
}