import java.io.IOException;

public class Program {

    void execute() throws IOException {
        InsertData insert = new InsertData();
        int quantity =  Integer.parseInt(insert.input.readLine());
        for (int i = 0; i < quantity; i++){
            String[][] date = new Date().get();
            double[] distance = new Distance().calculate(date);
            new Show().result(new Sort().make(date, distance));
            insert.input.readLine();
        }
    }
}