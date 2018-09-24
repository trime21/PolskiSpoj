import java.util.ArrayList;

public class Palindrome {
    void test(int number, ArrayList<Integer> list) {
        IntToList toList = new IntToList();
        CheckTheNumber theNumber = new CheckTheNumber();
        NewNumber next = new NewNumber();
        list = toList.make(number, list);
        int numberOfTheSame = theNumber.test(list);
        boolean palindromeTest = (list.size() / 2) == numberOfTheSame;
        int steps = 0;
        while (!palindromeTest) {
            number = next.make(number, list);
            list.clear();
            list = toList.make(number, list);
            numberOfTheSame = theNumber.test(list);
            palindromeTest = list.size() / 2 == numberOfTheSame;
            steps++;
        }
        System.out.println(number + " " + steps);
    }
}
