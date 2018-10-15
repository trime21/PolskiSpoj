import java.util.LinkedList;

public class ListNumbers {

    LinkedList<Integer> make(int startList, int endList) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = startList; i <= endList; i++)
            list.add(i);
        return list;
    }
}