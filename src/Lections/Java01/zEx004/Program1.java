package Lections.Java01.zEx004;

public class Program1 {


    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        Point2D b = new Point2D(0);

        System.out.println(a.toString());
        System.out.println(b.toString());

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
