import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    void execute() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(input.readLine());
        for (int i = 0; i < quantity; i ++){
            int elementNumber = 0;
            int element = Integer.parseInt(input.readLine());
            while (element != 1){
                if (element % 2 != 0) {
                    element = 3 * element + 1;
                }
                else {
                    element = element / 2;
                }
                elementNumber++;
            }
            System.out.println(elementNumber);
        }
    }
}
