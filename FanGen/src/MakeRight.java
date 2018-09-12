public class MakeRight {
    public void makeRightFan(char[][][] tab) {
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int j = 0; j < tab[0][0].length / 2; j++) {
                tab[0][i][j] = new Char().getChar(new RightChar().getCharRight(i, j));
            }
        }
    }
}