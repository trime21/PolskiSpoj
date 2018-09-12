import java.util.Scanner;

public class Fan {
    void program() {
        Scanner input = new Scanner(System.in);
        int size;
        while ((size = input.nextInt()) != 0) {
            new Draw().drawFan(new Rotated().getRotated(new Make().makeFan(new Direction().getDirection(size), new Array().getArray(new SizeArray().getSizeArray(size)))));
        }
    }
}