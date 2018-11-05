import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        new Program().getResult(new StringToList().getList(new InputData().getData()));
    }
}
