public class Result {

    void show(String floatInHex) {
        for (int i = 0; i < floatInHex.length(); i++) {
            if (i % 2 == 0 && floatInHex.charAt(i) == '0') ;
            else
                System.out.print(floatInHex.charAt(i));
            if (i % 2 == 1)
                System.out.print(" ");
        }
        System.out.println();
    }
}