public class Circle {
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double Circumference() {
      return 2 * Math.PI * radius;
    }
    public double Area() {
       return Math.PI * radius * radius;
    }
    public double getRadius() {
    return radius;}
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius:" +" "+radius+" "+"Circumreference"+" "+Circumference()+" "+"Area"+" "+Area();
    }
}
