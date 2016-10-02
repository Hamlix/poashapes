/**
 * Created by Hamlix on 02/10/2016.
 */
public class Square extends Rectangle {
    public Square(){
        this(0.0,0.0);
    }

    public Square(double length, double width){
        this.length = length;
        if (width != length){
            this.width = length;
        }
        else{
            this.width = width;
        }
    }
}

