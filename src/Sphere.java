/**
 * Created by Hamlix on 02/10/2016.
 */
public class Sphere extends Shape3D {
    double radius;

    public Sphere(){
        this(0.0);
    }

    public double getRadius() {
        return radius;
    }

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double surface() {
        return 4.0 * Math.PI * this.radius * this.radius;
    }

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * this.radius * this.radius * this.radius;
    }
}
