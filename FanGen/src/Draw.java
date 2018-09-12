public class Draw {
    public void drawFan(char[][][] tab) {
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int r = 0; r < 2; r++) {
                for (int j = 0; j < tab[0][0].length / 2; j++) {
                    System.out.print(tab[r][i][j]);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int r = 3; r > 1; r--) {
                for (int j = 0; j < tab[0][0].length / 2; j++) {
                    System.out.print(tab[r][i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}