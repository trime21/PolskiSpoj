import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToList {

    List getList(String data) {
         return Arrays.stream(data.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    }
}
