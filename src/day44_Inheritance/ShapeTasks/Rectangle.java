package day44_Inheritance.ShapeTasks;

public class Rectangle extends Shape {
      /*
   variables: 4(1 instance, 3 static)
   methods: 4(4 instance methods)
    */
   public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;

    }

    public double calcArea() {
        return width * length;
    }

    public double calcPerimeter() {
        return (width+length)*2;
    }
}
