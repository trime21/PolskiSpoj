import java.util.ArrayList;

public class NewString {

    ArrayList merge (ArrayList listFirst, ArrayList listSecond) {
        ArrayList newList = new ArrayList();
        if (listFirst.size() > listSecond.size()){
            for (int i = 0; i < listSecond.size() ; i++){
                newList.add(listFirst.get(i));
                newList.add(listSecond.get(i));
            }
        } else {
            for (int i = 0; i < listFirst.size() ; i++) {
                newList.add(listFirst.get(i));
                newList.add(listSecond.get(i));
            }
        }
        return newList;
    }
}
