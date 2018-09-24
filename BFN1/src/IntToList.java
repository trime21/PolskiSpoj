import java.util.ArrayList;

public class IntToList {

    ArrayList<Integer> make(int number, ArrayList<Integer> list) {
        int tempNumber = number;
        list.add(tempNumber % 10);
        while (tempNumber > 9){
            tempNumber = tempNumber / 10;
            list.add(tempNumber % 10);
        }
        return list;
    }
}
