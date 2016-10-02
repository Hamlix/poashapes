/**
 * Created by Hamlix on 02/10/2016.
 */
public class Cone extends Shape3D {
    double height;
    double radius;

    public Cone(){
        this(0.0,0.0);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public Cone(double height, double radius){

        this.height = height;
        this.radius = radius;
    }

    @Override
    public double surface(){
        double base = Math.PI * this.radius * this.radius;
        double laterale = Math.PI * this.radius * Math.sqrt(this.radius * this.radius + this.height * this.height);
        return base + laterale;
    }

    @Override
    public double volume(){
        return (1.0/3.0) * Math.PI * this.radius * this.radius * this.height;
    }
}