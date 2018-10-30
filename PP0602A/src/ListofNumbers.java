import java.util.ArrayList;
import java.util.Arrays;

class ListofNumbers {

    ArrayList make(String numbers) {
        ArrayList list = new ArrayList<String>(Arrays.asList(numbers.split(" ")));
        return list;
    }
}