import java.util.Map;
import java.util.TreeMap;

public class Sort {

    Map<Double, String> make(String[][] arrayOfDate, double[] distance) {
        Map<Double, String>  mapOfPoints = new TreeMap<>();
        for (int i = 0; i < distance.length; i++){
            String point = (arrayOfDate[i][0] + " " + arrayOfDate[i][1] +  " " + arrayOfDate[i][2]);
            mapOfPoints.put(distance[i], point);
        }
        return  mapOfPoints;
    }
}