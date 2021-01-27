package day40_Constructor;

public class Circle {
    public static double PI;
    static{
        PI = 3.14;
    }
    public double r, d, area, perimeter;

    public Circle(double r) {
        this.r = r;
        d = d;
        area = area;
        perimeter = perimeter;
    }

}
class CircleObjects{
    public CircleObjects() {
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);

        Circle circle2 = new Circle(10);

    }


}
