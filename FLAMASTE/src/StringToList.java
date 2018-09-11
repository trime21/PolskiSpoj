import java.util.LinkedList;

public class StringToList {
    static LinkedList create(String word) {
        LinkedList longList = new LinkedList();
        for (int i = 0; i < word.length(); i++) {
            longList.add(word.charAt(i));
        }
        return longList;
    }
}