public class LeftChar {
    boolean getCharLeft(int line, int column) {
        boolean charTest = true;
        if (column >= line)
            charTest = true;
        else
            charTest = false;
        return charTest;
    }
}