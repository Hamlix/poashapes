/**
 * Created by Hamlix on 02/10/2016.
 */
public class Rectangle extends Shape2D {
    double length;
    double width;

    public Rectangle(){
        this(0.0,0.0);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double surface() {
        return this.length * this.width;
    }

    public double perimeter(){
        return 2.0*this.length + 2.0*this.width;
    }
}
