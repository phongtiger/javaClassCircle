public class Cylinder extends Circle {
    private double height = 1.0;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Cylinder() {
    }
    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }
    public String toString() {
        return " A Cylinder has height "
                + getHeight()
                + " and the bottom surface is "
                + super.toString();
    }

}
