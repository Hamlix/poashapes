/**
 * Created by Hamlix on 19/09/2016.
 */
public class Point2D {

    private double x;
    private double y;

    public Point2D() {
        this(0,0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isOrigin() {
        return (x == 0 && y == 0);
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distance(Point2D other) {
        final double dx = other.x - this.x;
        final double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D)) return false;

        Point2D point2D = (Point2D) o;

        if (Double.compare(point2D.x, x) != 0) return false;
        return Double.compare(point2D.y, y) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
