import java.util.LinkedList;

public class Sign {
    static void remove(int quanity, LinkedList shortWord) {
        if (quanity > 2) {
            int listSize = shortWord.size();
            for (int j = 0; j < quanity - 1; j++) {
                shortWord.remove( listSize - j - 1);
            }
            shortWord.add(Integer.toString(quanity));
        }
    }
}