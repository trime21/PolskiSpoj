import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    void execute(){
        Scanner input = new Scanner(System.in);
        int pairs = input.nextInt();
        for (int i = 0; i < pairs ; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int quantity = input.nextInt();
            for (int j = 0; j < quantity ; j++)
                list.add(input.nextInt());
            for (int j = quantity - 1; j > -1 ; j--)
                System.out.print(list.get(j) + " ");
            System.out.println();
        }
    }
}
