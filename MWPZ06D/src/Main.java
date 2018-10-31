import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int quantity = Integer.parseInt(new InputData().getData());
        for (int i = 0; i < quantity; i++) {
            String[] data = new InputData().getData().split(" ");
            int persons = Integer.parseInt(data[0]);
            int candies = Integer.parseInt(data[1]);
            if (persons - 1 > 0 && candies % (persons - 1) < 1)
                System.out.println("NIE");
            else
                System.out.println("TAK");
        }
    }
}