public class Cylinder {
    public double radius;
    public double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double surfaceArea() {
        return Math.PI * radius * radius;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    public String toString() {
        return "Cylinder with radius=" + radius + " "+"and"+" "+"height="+" "+height+" "+"surfaceArea"+" "+surfaceArea()+" "+"volume"+" "+volume();
    }
}
