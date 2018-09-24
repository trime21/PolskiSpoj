import java.util.ArrayList;

public class StringToList {

    void make(String words, ArrayList listFirst, ArrayList listSecond){
        int j = 0;
        while (words.charAt(j) != ' ') {
            listFirst.add(words.charAt(j));
            j++;
        }
        j++;
        for (j = j ; j < words.length() ; j ++)
            listSecond.add(words.charAt(j));
    }
}
