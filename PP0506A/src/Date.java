import java.io.IOException;

public class Date {

    String[][] get() throws IOException {
        InsertData insert = new InsertData();
        int quantityOfPoints = Integer.parseInt(insert.input.readLine());
        String[][] arrayOfDate = new String[quantityOfPoints][3];
        for (int i = 0; i < quantityOfPoints; i++){
            arrayOfDate[i] = insert.input.readLine().split(" ");
        }
        return arrayOfDate;
    }
}