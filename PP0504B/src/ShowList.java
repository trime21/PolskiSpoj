import java.util.ArrayList;

public class ShowList {

    void show (ArrayList list){
        for (int i = 0; i < list.size() ; i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
