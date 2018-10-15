import java.util.LinkedList;

public class Calculate {

    double result(LinkedList<Integer> listOfNumerators, LinkedList<Integer> listOfDenominators) {
        double binoms = 1;
        while (!listOfNumerators.isEmpty() || !listOfDenominators.isEmpty()) {
            if (!listOfNumerators.isEmpty())
                binoms *= listOfNumerators.	pollFirst();
            if (!listOfDenominators.isEmpty())
                binoms /= listOfDenominators.pollFirst();
        }
        return binoms;
    }
}