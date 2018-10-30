import java.io.IOException;
import java.util.ArrayList;

public class Program {

    void execute() throws IOException{
        int qantity = Integer.parseInt(new InputData().getData());
        for (int i = 0; i < qantity; i++) {
            ArrayList list = new ListofNumbers().make(new InputData().getData());
            new Result().show(list);
        }
    }
}