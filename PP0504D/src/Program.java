import java.io.IOException;

public class Program {

    void execute() throws IOException {
        int quantity = Integer.parseInt(new InsertData().get());
        for (int i = 0; i < quantity; i++)
            new Result().show(new FloatToHex().change(new StringToFloat().change(new InsertData().get())));
    }
}