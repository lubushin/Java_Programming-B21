package day49_Abstarction.ShapeTasks;

public final class Circle extends Shape {
   private double radius;
   private double diameter;
   public static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        if(radius<=0){
            throw new RuntimeException("No Such a circle with radius of "+ radius);
        }
        setRadius(radius);
        diameter = radius * 2;
    }
    @Override
    public double area() {
        return radius * radius * PI;
    }
    @Override
    public double perimeter() {
        return diameter * PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
