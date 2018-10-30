public class Calculate {

    int result(int numerator, int denominator) {
        int result = 1;
        if (denominator > 0 && denominator < numerator) {
            result = new Calculate().result(numerator - 1, denominator - 1) + new Calculate().result(numerator - 1, denominator);
        } else
            result = 1;
        return result;
    }
}