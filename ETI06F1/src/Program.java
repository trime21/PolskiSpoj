import java.util.Scanner;

public class Program {

    void execute(){
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double d = input.nextDouble();
        System.out.println((r * r - d * d / 4) * Math.PI);
    }
}
