/**
 * Created by Hamlix on 02/10/2016.
 */
public abstract class Shape2D extends Shape {

    Point2D refPoint;

    public abstract double surface();

    public Point2D getRefPoint() {
        return this.refPoint;
    }

}
