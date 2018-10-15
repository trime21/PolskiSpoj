public class Game {

    int play(int firstPlayerTokens, int secondPlayerTokens) {
        while (firstPlayerTokens != secondPlayerTokens) {
            if (secondPlayerTokens < firstPlayerTokens) {
                int temp = firstPlayerTokens;
                firstPlayerTokens = secondPlayerTokens;
                secondPlayerTokens = temp;
            }
            secondPlayerTokens -= firstPlayerTokens;
        }
        return secondPlayerTokens * 2;
    }
}