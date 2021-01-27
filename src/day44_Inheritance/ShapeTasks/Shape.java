package day44_Inheritance.ShapeTasks;

public class Shape {

    public String name;
    public final static boolean isShape, hasArea, hasPerimeter;//constant : final

   public Shape(String name){
        this.name = name;
    }
    static{
        isShape= true;
       hasArea = true;
       hasPerimeter = true;
    }

   protected double calcArea(){
        return 0;
    }

    public double calcPerimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "Area = '"+calcArea()+'\'' +
                "Perimeter = '"+calcPerimeter()+'\'' +
                '}';
    }
}
/*
  1. create a class called Shape
 vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
 methods: setInfo, calcArea(), calcPerimeter(),
 toString(): returns the name, area and perimeter that are returned by calcArea(),
 calcPerimeter()
        2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
 give the instance variables that are needed to calculate the Area, perimeter,
 of those shapes
    AFTER TODAY'S TOPIC: Overriding
 3. override super class' calculateArea(), calculatePerimeter() methods
 to the sub classes:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side
        4. create constructor in shape class that can initialize the instances

 */