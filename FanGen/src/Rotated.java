public class Rotated {
    
    char[][][] getRotated(char tab[][][]) {
        for (int r = 0; r < 3; r++) {
            for (int i = 0; i < tab[0].length / 2; i++) {
                for (int j = 0; j < tab[0][0].length / 2; j++) {
                    tab[r + 1][i][tab[0][0].length / 2 - j - 1] = tab[r][j][i];
                }
            }
        }
        return tab;
    }
}
