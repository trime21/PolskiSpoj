import java.util.Map;

public class Show {

    void result(Map<Double, String> mapOfPoints) {
        for (String val : mapOfPoints.values())
            System.out.println(val + " ");
    }
}