import java.util.LinkedList;

public class Word {
    static LinkedList create(LinkedList longList) {
        LinkedList shortWord = new LinkedList();
        shortWord.add(longList.get(0));
        int quanity = 1;
        for (int i = 1; i < longList.size(); i++) {
            if (longList.get(i - 1).equals(longList.get(i))) {
                quanity++;
                shortWord.add(longList.get(i));

            } else {
                Sign.remove(quanity, shortWord);
                shortWord.add(longList.get(i));
                quanity = 1;
            }
        }
        Sign.remove(quanity, shortWord);
        return shortWord;
    }
}