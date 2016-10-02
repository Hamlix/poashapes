/**
 * Created by Hamlix on 02/10/2016.
 */
public class Cuboid extends Shape3D {
    double length;
    double width;
    double height;

    public Cuboid(){
        this(0.0,0.0,0.0);
    }

    public Cuboid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double surface() {
        return 2.0*(this.length*this.width + this.width*this.height + this.length*this.height);
    }

    @Override
    public double volume() {
        return this.length * this.width * this.height;
    }
}
