import java.util.List;

public class Program {

    void getResult(List data) {
        if ((double) data.get(0) != 0)
            System.out.format("%.2f%n", ((double) data.get(2) - (double) data.get(1)) / (double) data.get(0));
        else if ((double) data.get(2) != (double) data.get(1))
            System.out.println("BR");
        else
            System.out.println("NWR");
    }
}
