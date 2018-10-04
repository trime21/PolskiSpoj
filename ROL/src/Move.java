public class Move {

    int[] toLeft(int[] data) {
        int temp = data[0];
        for (int i = 1; i < data.length; i++)
            data[i-1] = data[i];
        data[data.length - 1] = temp;
        return data;
    }
}