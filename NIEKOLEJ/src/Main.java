import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = new InputData().getData();
        if (number < 3 && number != 0)
            output.write("NIE");
        else {
            for (int i = 1; i < number + 1; i += 2)
                output.write(i + " ");
            for (int i = 0; i < number + 1; i += 2)
                output.write(i + " ");
        }
        output.flush();
    }
}