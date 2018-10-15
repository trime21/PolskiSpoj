public class FloatToHex {

    String change(float floatNumber) {
        String floatInHex;
        if (floatNumber != 0.0)
            floatInHex = Integer.toHexString(Float.floatToIntBits(floatNumber));
        else
            floatInHex = "00000000";
        return floatInHex;
    }
}