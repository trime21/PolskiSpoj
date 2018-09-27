import java.io.*;

public class Fan {
    
    void program() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int size;
        while ((size = Integer.parseInt(input.readLine())) != 0){
            new Draw().drawFan(new Rotated().getRotated(new Make().makeFan(new Direction().getDirection(size), new Array().getArray(new SizeArray().getSizeArray(size)))));
        }
    }
}
