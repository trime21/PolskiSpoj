import java.io.IOException;

public class Program {

    void execute() throws IOException {
        int quantity = Integer.parseInt(new InputData().getData());
        for (int i = 0; i < quantity; i++) {
            String[] data = new InputData().getData().split(" ");
            int differenceNow = Integer.parseInt(data[0]) * 12;
            int forHowManyMonths = Integer.parseInt(data[1]) * 12;
            float howManyTimes = Float.parseFloat(data[2]);
            float result = (float) Math.abs((differenceNow + forHowManyMonths - forHowManyMonths * howManyTimes) / (howManyTimes - 1));
            System.out.println(Math.round(result));
        }
    }
}