public class Distance {

    double[] calculate(String[][] arrayOfDate) {
        double[] distance = new double[arrayOfDate.length];
        for (int i = 0; i < arrayOfDate.length; i++){
            double x = Double.parseDouble(arrayOfDate[i][1]);
            double y = Double.parseDouble(arrayOfDate[i][2]);
            distance[i] = Math.sqrt(x * x + y * y);
        }
        return distance;
    }
}