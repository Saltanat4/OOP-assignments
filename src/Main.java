import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(5.0);
        Cylinder cylinder=new Cylinder(4.0 ,10.0);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}