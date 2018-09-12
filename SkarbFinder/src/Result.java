public class Result {
    static void show(int northSouth, int westEast){
        if (northSouth > 0)
            System.out.println("0 " + northSouth);
        if (northSouth < 0) {
            northSouth = northSouth * (-1);
            System.out.println("1 " + northSouth);
        }
        if (westEast > 0)
            System.out.println("2 " + westEast);
        if (westEast < 0) {
            westEast = westEast * (-1);
            System.out.println("3 " + westEast);
        }
        if (northSouth == 0 && westEast == 0)
            System.out.println("studnia");
    }
}