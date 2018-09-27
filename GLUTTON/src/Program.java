import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    void execute() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(input.readLine());
        for (int i = 0; i < quantity; i++){
            int sumOfTheEatenCookies = 0;
            String date[] = input.readLine();
            for (int j = 0; j < Integer.parseInt(date[0]); j++){
                sumOfTheEatenCookies += 86400 / Integer.parseInt(input.readLine());
            }
            System.out.println((int) Math.ceil(sumOfTheEatenCookies / Float.parseFloat(date[1])));
        }
    }
}
