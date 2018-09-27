public class Make {
    
    char[][][] makeFan(boolean direction, char[][][] tab) {
        if (direction)
            new MakeRight().makeRightFan(tab);
        else
            new MakeLeft().makeLeftFan(tab);
        return tab;
    }
}
