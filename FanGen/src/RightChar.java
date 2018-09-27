public class RightChar {
    
    boolean getCharRight(int line, int column) {
        boolean charTest = true;
        if (line >= column)
            charTest = true;
        else
            charTest = false;
        return charTest;
    }
}
