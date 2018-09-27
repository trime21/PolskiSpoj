public class Draw {
    public void drawFan(char[][][] tab) {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int r = 0; r < 2; r++) {
                for (int j = 0; j < tab[0][0].length / 2; j++)
                    output.write(tab[r][i][j]);
            }
            output.newLine();
        }
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int r = 3; r > 1; r--) {
                for (int j = 0; j < tab[0][0].length / 2; j++)
                    output.write(tab[r][i][j]);
            }
            output.newLine();
        }
        output.newLine();
        output.flush();
    }
}
