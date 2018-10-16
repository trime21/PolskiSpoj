import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String insert;
        int quantity = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            while ((insert = input.readLine()).equals("-") || insert.equals("+")) {
                try {
                    if (insert.equals("+")) {
                        int a = Integer.parseInt(input.readLine());
                        if (quantity < 10) {
                            list.add(a);
                            System.out.println(":)");
                            quantity++;
                        } else
                            System.out.println(":(");
                    } else {
                        if (quantity > 0) {
                            System.out.println(list.get(quantity - 1));
                            list.remove(quantity - 1);
                            quantity--;
                        } else
                            System.out.println(":(");
                    }
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
    }
}