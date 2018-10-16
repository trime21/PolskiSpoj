import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] insert;
        int[] array = new int[10];
        try {
            while ((insert = input.readLine().split(" ")).length != 0) {
                try {
                    switch (insert[0]){
                        case "z":
                            array[Integer.parseInt(insert[1])] = Integer.parseInt(insert[2]);
                            break;
                        case "+":
                            System.out.println(array[Integer.parseInt(insert[1])] + array[Integer.parseInt(insert[2])]);
                            break;
                        case "-":
                            System.out.println(array[Integer.parseInt(insert[1])] - array[Integer.parseInt(insert[2])]);
                            break;
                        case "*":
                            System.out.println(array[Integer.parseInt(insert[1])] * array[Integer.parseInt(insert[2])]);
                            break;
                        case "/":
                            System.out.println(array[Integer.parseInt(insert[1])] / array[Integer.parseInt(insert[2])]);
                            break;
                        case "%":
                            System.out.println(array[Integer.parseInt(insert[1])] % array[Integer.parseInt(insert[2])]);
                            break;
                    }
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
    }}