import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Program {

    String getData() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputData = input.readLine();
        return inputData;
    }

    void execute() throws IOException {
        int quantity = Integer.parseInt(new Program().getData());
        for (int i = 0; i < quantity; i++) {
            String[] size = new Program().getData().split(" ");
            int sizeRow = Integer.parseInt(size[0]);
            int sizeColumn = Integer.parseInt(size[1]);
            ArrayList<ArrayList> list = new Program().getList(sizeRow);
            new Program().showResult(sizeRow, sizeColumn, list);
        }
    }

    ArrayList<ArrayList> getList(int sizeRow) throws IOException {
        ArrayList<ArrayList> list = new ArrayList();
        for (int j = 0; j < sizeRow; j++)
            list.add(new ArrayList(Arrays.asList(new Program().getData().split(" "))));
        return list;
    }

    void showResult(int sizeRow, int sizeColumn, ArrayList<ArrayList> list) {
        for (int column = 0; column < sizeColumn - 1; column++)
            System.out.print(list.get(0).get(column + 1) + " ");
        System.out.println(list.get(1).get(sizeColumn - 1));
        for (int row = 1; row < sizeRow - 1; row++) {
            System.out.print(list.get(row - 1).get(0) + " ");
            for (int column = 1; column < sizeColumn - 1; column++)
                System.out.print(list.get(row).get(column) + " ");
            System.out.println(list.get(row + 1).get(sizeColumn - 1));
        }
        System.out.print(list.get(sizeRow - 2).get(0) + " ");
        for (int column = 1; column < sizeColumn; column++)
            System.out.print(list.get(sizeRow - 1).get(column - 1) + " ");
        System.out.println();
    }
}