/**
 * Created by Hamlix on 02/10/2016.
 */
public class Point3D extends Point2D {

    private double z;

    public Point3D() {
        this(0.0, 0.0, 0.0);
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    @Override
    public boolean isOrigin() {
        return (x == 0.0 && y == 0.0 && z == 0.0);
    }

    /* Pas besoin d'override car la méthode n'a pas le même nombre d'argument que la méthode mère*/
    public void translate(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    /* Pas besoin d'override car la méthode ne prend pas le même type d'argument qe la methode mere*/
    public double distance(Point3D other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        double dz = other.z - this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

}
