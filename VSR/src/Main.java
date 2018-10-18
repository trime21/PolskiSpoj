import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int quantity = Integer.parseInt(input.readLine());
        for (int i = 0; i < quantity; i++){
            String[] data = input.readLine().split(" ");
            output.write(String.valueOf((2 * Integer.parseInt(data[0]) * Integer.parseInt(data[1])) / (Integer.parseInt(data[0]) + Integer.parseInt(data[1]))));
            output.newLine();
            output.flush();
        }
    }
}