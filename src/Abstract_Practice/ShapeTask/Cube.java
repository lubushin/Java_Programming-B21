package Abstract_Practice.ShapeTask;

public class Cube extends Shape implements Volume {
    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }


    @Override
    public double area() {
        return side * side * side;
    }

    @Override
    public double perimeter() {
        return side * 6;
    }

    @Override
    public double volume() {
        return side * 12;
    }

    public String toString() {
        return "Shape{" +
                "name ='" + name + '\'' +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                "volume ='" + volume() + '\'' +
                '}';
    }
}
/*
      Cube extends Shape implements Volume
        Cylinder extends Shape implements Volume

 */