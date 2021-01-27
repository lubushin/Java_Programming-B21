package Abstract_Practice.ShapeTask;

public abstract class Shape {
public String name;
    public Shape(String name) {
        this.name = name;
    }
public  abstract double area();
public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name ='" + name + '\'' +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
/*
        abstract Shape:
            name
            area();
            perimeter();
            toString(){ }

 */