package Abstract_Practice.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);
        Square square = new Square(4);
        Cube cube = new Cube(7);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(cube);
    }
}
