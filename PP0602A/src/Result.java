import java.util.ArrayList;

class Result {

    void show(ArrayList listOfNumbers) {
        for (int i = 2; i < listOfNumbers.size(); i += 2)
            System.out.print(listOfNumbers.get(i) + " ");
        for (int i = 1; i < listOfNumbers.size(); i += 2)
            System.out.print(listOfNumbers.get(i) + " ");
        System.out.println();
    }
}