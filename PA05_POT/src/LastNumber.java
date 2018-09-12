public class LastNumber {
    static int resultShow(int base, int result, int index) {
        int rest;
        switch (base) {
            case 0:
                result = 0;
                break;
            case 1:
                result = 1;
                break;
            case 2:
                rest = index % 4;
                switch (rest) {
                    case 0:
                        result = 6;
                        break;
                    case 1:
                        result = 2;
                        break;
                    case 2:
                        result = 4;
                        break;
                    case 3:
                        result = 8;
                        break;
                }
                break;
            case 3:
                rest = index % 4;
                switch (rest) {
                    case 0:
                        result = 1;
                        break;
                    case 1:
                        result = 3;
                        break;
                    case 2:
                        result = 9;
                        break;
                    case 3:
                        result = 7;
                        break;
                }
                break;
            case 4:
                if (index % 2 == 0) {
                    result = 6;
                } else {
                    result = 4;
                }
                break;
            case 5:
                result = 5;
                break;
            case 6:
                result = 6;
                break;
            case 7:
                rest = index % 4;
                switch (rest) {
                    case 0:
                        result = 1;
                        break;
                    case 1:
                        result = 7;
                        break;
                    case 2:
                        result = 9;
                        break;
                    case 3:
                        result = 3;
                        break;
                }
                break;
            case 8:
                rest = index % 4;
                switch (rest) {
                    case 0:
                        result = 6;
                        break;
                    case 1:
                        result = 8;
                        break;
                    case 2:
                        result = 4;
                        break;
                    case 3:
                        result = 2;
                        break;
                }
                break;
            case 9:
                if (index % 2 == 0) {
                    result = 1;
                } else {
                    result = 9;
                }
                break;
        }
        return result;
    }
}
