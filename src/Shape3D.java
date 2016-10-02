/**
 * Created by Hamlix on 02/10/2016.
 */

public abstract class Shape3D extends Shape implements Translatable3D{
    Point3D refPoint;

    public abstract double volume();

    public Point3D getRefPoint(){
        return this.refPoint;
    }
}