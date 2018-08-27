import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fan fanGen = new Fan();
        int size;
        while ((size = input.nextInt()) != 0){
            boolean direction = size > 0;
            size = Math.abs(size)*2;
            char tab[][][] = new char[4][size][size];
            fanGen.makeFan(direction, size, tab);
            fanGen.drawFan(size, fanGen.getRotated(tab, size));
        }
    }
}

class Fan {

    boolean getCharRight(int line, int column){
        boolean charTest = true;
        if (line >= column)
            charTest = true;
        else
            charTest = false;
        return charTest;
    }

    boolean getCharLeft(int line, int column){
        boolean charTest = true;
        if (column >= line)
            charTest = true;
        else
            charTest = false;
        return charTest;
    }

    char getChar(boolean charTest){
        char charUsed;
        if (charTest)
            charUsed = '*';
        else
            charUsed = '.';
        return charUsed;
    }

    public void makeFan(boolean direction, int size, char[][][] tab){
        if (direction) {
            for (int i = 0; i < size / 2; i++) {
                for (int j = 0; j < size / 2; j++) {
                    tab[0][i][j] = getChar(getCharRight(i, j));
                }
            }
        } else {
            for (int i = 0; i < size / 2; i++) {
                for (int j = 0; j < size / 2; j++) {
                    tab[0][i][j] = getChar(getCharLeft(i, j));
                }
            }
        }
        getRotated(tab, size);
    }

    char[][][] getRotated(char tab[][][], int size){
        for (int r = 0; r < 3; r++) {
            for (int i = 0; i < size / 2; i++) {
                for (int j = 0; j < size / 2; j++) {
                    tab[r+1][i][size / 2 - j - 1] = tab[r][j][i];
                }
            }
        }
        return tab;
    }

    public void drawFan(int size, char[][][] tab) {
        for (int i = 0; i < size / 2; i++) {
            for (int r = 0; r < 2; r++) {
                for (int j = 0; j < size / 2; j++) {
                    System.out.print(tab[r][i][j]);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size / 2; i++) {
            for (int r = 3; r > 1; r--) {
                for (int j = 0; j < size / 2; j++) {
                    System.out.print(tab[r][i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
