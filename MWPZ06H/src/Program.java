import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Program {

    void execute() throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int quantity = Integer.parseInt(new InputData().getData());
        for (int i = 0; i < quantity; i++) {
            new InputData().getData();
            List<Integer> list = Stream.of(new InputData().getData().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            Collections.sort(list);
            int max = list.get(list.size() - 1);
            output.write(list.get(list.size() - 1) + " ");
            list.remove(list.size() - 1);
            while (list.contains(max)) {
                output.write(list.get(list.size() - 1) + " ");
                list.remove(list.size() - 1);
            }
            for (int x : list)
                output.write(x + " ");
            output.newLine();
        }
        output.flush();
    }
}