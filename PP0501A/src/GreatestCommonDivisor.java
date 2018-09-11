public class GreatestCommonDivisor {
    static int show (int aNumber, int bNumber){
        while (aNumber != bNumber) {
            if (aNumber < bNumber)
                bNumber = bNumber - aNumber;
            else
                aNumber = aNumber - bNumber;
        }
        return  aNumber;
    }
}