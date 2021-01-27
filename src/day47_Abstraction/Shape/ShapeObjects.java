package day47_Abstraction.Shape;

public class ShapeObjects {//Has A - no relationship(extends)
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Cirle Area: "+ circle.area());

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Rectangle Area: "+ rectangle.area());

        Square square = new Square(3);
        System.out.println("Square Area: "+square.area());

    }
}
