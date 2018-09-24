import java.util.ArrayList;

public class CheckTheNumber {

    int test(ArrayList<Integer> list) {
        int numberOfTheSame = 0;
        for (int i = 0; i < list.size() / 2; i++){
            if (list.get(i) == list.get(list.size() - i - 1))
                numberOfTheSame++;
            else
                break;
        }
        return numberOfTheSame;
    }
}
