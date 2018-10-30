import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

class Program {

    String getData() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputData = input.readLine();
        return inputData;
    }

    int[] getArrayOfInts() throws IOException {
        int[] array = Arrays.asList(new Program().getData().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        return array;
    }

    void execcute() throws IOException {
        int quantity = Integer.parseInt(new Program().getData());
        for (int i = 0; i < quantity; i++) {
            int[] array = new Program().getArrayOfInts();
            int sum = IntStream.of(array).sum() - array[0];
            float average = (float) sum / array[0];
            System.out.println(array[new Program().findMinimum(average, array)]);
        }
    }

    int findMinimum(float average, int[] array) {
        float difference = average;
        float minimum = average;
        int counter = 0;
        int number = 1;
        while (difference != 0 && counter < array.length - 1) {
            counter++;
            difference = Math.abs(average - array[counter]);
            if (difference < minimum) {
                number = counter;
                minimum = difference;
            }
        }
        return number;
    }
}