package Lections.Java01.zEx004;

/**
 * Это точка 2D
 */

public class Point2D {
    private int x, y;

    /**
     * Это конструктор ...
     *
     * @param x это координата X
     * @param y это координата Y
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

//    public Point2D() {
//        this.x = 0;
//        this.y = 0;
//    }
//
//    public Point2D(int value) {
//        this.x = value;
//        this.y = value;
//    }

//    public String getInfo(){
//        return String.format("x: %d; y: %d", x, y);
//    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    // ctor
    // get; set
    // docs
    //
}
