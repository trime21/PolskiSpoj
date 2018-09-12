import java.util.Scanner;

public class Program {
    static void execute() {
        int sets = 0;
        int tips = 0;
        int direction, value;
        Scanner input = new Scanner(System.in);
        sets = input.nextInt();
        for (int i = 0; i < sets; i++) {
            tips = input.nextInt();
            int northSouth = 0;
            int westEast = 0;
            for (int j = 0; j < tips; j++) {
                direction = input.nextInt();
                value = input.nextInt();
                switch (direction) {
                    case 0:
                        northSouth += value;
                        break;
                    case 1:
                        northSouth -= value;
                        break;
                    case 2:
                        westEast += value;
                        break;
                    case 3:
                        westEast -= value;
                        break;
                }
            }
            Result.show(northSouth, westEast);
        }
    }
}