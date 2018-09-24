import java.util.ArrayList;

public class NewNumber {

    int make(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size() ; i++){
            number += list.get(i) * Math.pow(10, (list.size() - 1 - i));
        }
        return number;
    }
}
