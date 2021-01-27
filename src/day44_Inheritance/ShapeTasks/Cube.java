package day44_Inheritance.ShapeTasks;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    @Override
    protected double calcArea() {
      Square square = new Square(side);//one area of cube
      double area = square.calcArea();
        //cube has 6 sides
        return area * 6;
    }

    public double calcPerimeter() {
        return side *12;
    }
}
