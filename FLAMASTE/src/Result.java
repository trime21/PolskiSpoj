import java.util.LinkedList;

public class Result {
    static void show(LinkedList shortWord) {
        for (int i = 0; i < shortWord.size(); i++)
            System.out.print(shortWord.get(i));
        System.out.println();
    }
}

