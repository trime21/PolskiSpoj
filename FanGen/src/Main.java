import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Fan().program();
    }
}

class Fan {
    void program() {
        Scanner input = new Scanner(System.in);
        int size;
        while ((size = input.nextInt()) != 0) {
            new Draw().drawFan(new Rotated().getRotated(new Make().makeFan(new Direction().getDirection(size), new Table().getTable(new SizeArray().getSizeArray(size)))));
        }
    }
}

class SizeArray {
    int getSizeArray(int size){
        size = Math.abs(size) * 2;
        return size;
    }
}

class Table {
    char[][][] getTable(int size){
        char tab[][][] = new char[4][size][size];
        return tab;
    }
}

class RightChar {
    boolean getCharRight(int line, int column) {
        boolean charTest = true;
        if (line >= column)
            charTest = true;
        else
            charTest = false;
        return charTest;
    }
}

class LeftChar {
    boolean getCharLeft(int line, int column) {
        boolean charTest = true;
        if (column >= line)
            charTest = true;
        else
            charTest = false;
        return charTest;
    }
}

class Char{
    char getChar(boolean charTest) {
        char charUsed;
        if (charTest)
            charUsed = '*';
        else
            charUsed = '.';
        return charUsed;
    }
}

class Direction {
    boolean getDirection(int size) {
        boolean direction = size > 0;
        return direction;
    }
}

class MakeRight {
    public void makeRightFan(char[][][] tab) {
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int j = 0; j < tab[0][0].length / 2; j++) {
                tab[0][i][j] = new Char().getChar(new RightChar().getCharRight(i, j));
            }
        }
    }
}

class MakeLeft {
    public void makeLeftFan(char[][][] tab) {
        for (int i = 0; i < tab[0].length / 2; i++) {
            for (int j = 0; j < tab[0][0].length / 2; j++) {
                tab[0][i][j] = new Char().getChar(new LeftChar().getCharLeft(i, j));
            }
        }
    }
}

class Make {
    char[][][] makeFan(boolean direction, char[][][] tab) {
        if (direction)
            new MakeRight().makeRightFan(tab);
        else
            new MakeLeft().makeLeftFan(tab);
        return tab;
    }
}

class Rotated {
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

class Draw {
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
