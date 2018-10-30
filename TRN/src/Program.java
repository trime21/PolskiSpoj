import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    void execute() throws IOException {
        String[] size = new InsertData().getData().split(" ");
        ArrayList<ArrayList> list = new ArrayList();
        for (int i = 0; i < Integer.parseInt(size[0]); i++) {
            String[] value = new InsertData().getData().split(" ");
            list.add(new ArrayList(Arrays.asList(value)));
        }
        new OutputData().showResult(list);
    }
}