import java.util.Scanner;

public class LowestCommonMultiple{
    static void show(){
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for(int i = 0; i < quantity ; i++){
            int aGroupQuantity = input.nextInt();
            int bGroupQuantity = input.nextInt();
            int abTemp = aGroupQuantity * bGroupQuantity;
            int temp = 0;
            while (bGroupQuantity != 0){
                temp = bGroupQuantity;
                bGroupQuantity = aGroupQuantity % bGroupQuantity;
                aGroupQuantity = temp;
            }
            System.out.println(abTemp / aGroupQuantity);
        }
    }
}