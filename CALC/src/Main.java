import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] insert;
        try {
            while ((insert = input.readLine().split(" ")).length != 0) {
                try {
                    switch (insert[0]){
                        case "+":
                            System.out.println(Integer.parseInt(insert[1]) + Integer.parseInt(insert[2]));
                            break;
                        case "-":
                            System.out.println(Integer.parseInt(insert[1]) - Integer.parseInt(insert[2]));
                            break;
                        case "*":
                            System.out.println(Integer.parseInt(insert[1]) * Integer.parseInt(insert[2]));
                            break;
                        case "/":
                            System.out.println(Integer.parseInt(insert[1]) / Integer.parseInt(insert[2]));
                            break;
                        case "%":
                            System.out.println(Integer.parseInt(insert[1]) % Integer.parseInt(insert[2]));
                            break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
    }
}